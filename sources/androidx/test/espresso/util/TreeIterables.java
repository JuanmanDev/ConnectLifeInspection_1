package androidx.test.espresso.util;

import android.view.View;
import android.view.ViewGroup;
import androidx.test.espresso.core.internal.deps.guava.base.Function;
import androidx.test.espresso.core.internal.deps.guava.base.Preconditions;
import androidx.test.espresso.core.internal.deps.guava.collect.AbstractIterator;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables;
import androidx.test.espresso.core.internal.deps.guava.collect.Lists;
import androidx.test.espresso.core.internal.deps.guava.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class TreeIterables {
    public static final TreeViewer<View> VIEW_TREE_VIEWER = new ViewTreeViewer();

    public static class DistanceRecordingTreeViewer<T> implements TreeViewer<T> {
        public final TreeViewer<T> delegateViewer;
        public final Map<T, Integer> nodeToDistance = Maps.newHashMap();
        public final T root;

        public DistanceRecordingTreeViewer(T t, TreeViewer<T> treeViewer) {
            this.root = Preconditions.checkNotNull(t);
            this.delegateViewer = (TreeViewer) Preconditions.checkNotNull(treeViewer);
        }

        public Collection<T> children(T t) {
            if (t == this.root) {
                this.nodeToDistance.put(t, 0);
            }
            int distance = getDistance(t) + 1;
            Collection<T> children = this.delegateViewer.children(t);
            for (T put : children) {
                this.nodeToDistance.put(put, Integer.valueOf(distance));
            }
            return children;
        }

        public int getDistance(T t) {
            return ((Integer) Preconditions.checkNotNull(this.nodeToDistance.get(t), "Never seen %s before", t)).intValue();
        }
    }

    public enum TraversalStrategy {
        BREADTH_FIRST {
            public <T> void combineNewChildren(LinkedList<T> linkedList, Collection<T> collection) {
                linkedList.addAll(collection);
            }
        },
        DEPTH_FIRST {
            public <T> void combineNewChildren(LinkedList<T> linkedList, Collection<T> collection) {
                linkedList.addAll(0, collection);
            }
        };

        public abstract <T> void combineNewChildren(LinkedList<T> linkedList, Collection<T> collection);

        public <T> T next(LinkedList<T> linkedList) {
            return linkedList.removeFirst();
        }
    }

    public static class TreeTraversalIterable<T> implements Iterable<T> {
        public final T root;
        public final TraversalStrategy traversalStrategy;
        public final TreeViewer<T> treeViewer;

        public Iterator<T> iterator() {
            final LinkedList newLinkedList = Lists.newLinkedList();
            newLinkedList.add(this.root);
            return new AbstractIterator<T>() {
                public T computeNext() {
                    if (newLinkedList.isEmpty()) {
                        return endOfData();
                    }
                    T checkNotNull = Preconditions.checkNotNull(TreeTraversalIterable.this.traversalStrategy.next(newLinkedList), "Null items not allowed!");
                    TreeTraversalIterable.this.traversalStrategy.combineNewChildren(newLinkedList, TreeTraversalIterable.this.treeViewer.children(checkNotNull));
                    return checkNotNull;
                }
            };
        }

        public TreeTraversalIterable(T t, TraversalStrategy traversalStrategy2, TreeViewer<T> treeViewer2) {
            this.root = Preconditions.checkNotNull(t);
            this.traversalStrategy = (TraversalStrategy) Preconditions.checkNotNull(traversalStrategy2);
            this.treeViewer = (TreeViewer) Preconditions.checkNotNull(treeViewer2);
        }
    }

    public interface TreeViewer<T> {
        Collection<T> children(T t);
    }

    public static class ViewAndDistance {
        public final int distanceFromRoot;
        public final View view;

        public int getDistanceFromRoot() {
            return this.distanceFromRoot;
        }

        public View getView() {
            return this.view;
        }

        public ViewAndDistance(View view2, int i) {
            this.view = view2;
            this.distanceFromRoot = i;
        }
    }

    public static class ViewTreeViewer implements TreeViewer<View> {
        public Collection<View> children(View view) {
            Preconditions.checkNotNull(view);
            if (!(view instanceof ViewGroup)) {
                return Collections.emptyList();
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            ArrayList newArrayList = Lists.newArrayList();
            for (int i = 0; i < childCount; i++) {
                newArrayList.add(viewGroup.getChildAt(i));
            }
            return newArrayList;
        }
    }

    public static <T> Iterable<T> breadthFirstTraversal(T t, TreeViewer<T> treeViewer) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(treeViewer);
        return new TreeTraversalIterable(t, TraversalStrategy.BREADTH_FIRST, treeViewer);
    }

    public static Iterable<View> breadthFirstViewTraversal(View view) {
        return breadthFirstTraversal(view, VIEW_TREE_VIEWER);
    }

    public static <T> Iterable<T> depthFirstTraversal(T t, TreeViewer<T> treeViewer) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(treeViewer);
        return new TreeTraversalIterable(t, TraversalStrategy.DEPTH_FIRST, treeViewer);
    }

    public static Iterable<View> depthFirstViewTraversal(View view) {
        return depthFirstTraversal(view, VIEW_TREE_VIEWER);
    }

    public static Iterable<ViewAndDistance> depthFirstViewTraversalWithDistance(View view) {
        final DistanceRecordingTreeViewer distanceRecordingTreeViewer = new DistanceRecordingTreeViewer(view, VIEW_TREE_VIEWER);
        return Iterables.transform(depthFirstTraversal(view, distanceRecordingTreeViewer), new Function<View, ViewAndDistance>() {
            public ViewAndDistance apply(View view) {
                return new ViewAndDistance(view, DistanceRecordingTreeViewer.this.getDistance(view));
            }
        });
    }
}
