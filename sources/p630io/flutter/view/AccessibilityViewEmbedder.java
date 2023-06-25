package p630io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
/* renamed from: io.flutter.view.AccessibilityViewEmbedder */
public class AccessibilityViewEmbedder {
    public static final String TAG = "AccessibilityBridge";
    public final Map<View, Rect> embeddedViewToDisplayBounds;
    public final SparseArray<C9452c> flutterIdToOrigin = new SparseArray<>();
    public int nextFlutterId;
    public final Map<C9452c, Integer> originToFlutterId;
    public final C9451b reflectionAccessors = new C9451b();
    public final View rootAccessibilityView;

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$b */
    public static class C9451b {
        @Nullable

        /* renamed from: a */
        public final Method f18693a;
        @Nullable

        /* renamed from: b */
        public final Method f18694b;
        @Nullable

        /* renamed from: c */
        public final Method f18695c;
        @Nullable

        /* renamed from: d */
        public final Method f18696d;
        @Nullable

        /* renamed from: e */
        public final Field f18697e;
        @Nullable

        /* renamed from: f */
        public final Method f18698f;

        /* renamed from: j */
        public static int m25668j(long j) {
            return (int) (j >> 32);
        }

        /* renamed from: k */
        public static boolean m25669k(long j, int i) {
            return (j & (1 << i)) != 0;
        }

        @Nullable
        /* renamed from: l */
        public static Long m25670l(AccessibilityNodeInfo accessibilityNodeInfo) {
            Long l = null;
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m25669k(readLong, 0)) {
                obtain2.readInt();
            }
            if (m25669k(readLong, 1)) {
                obtain2.readLong();
            }
            if (m25669k(readLong, 2)) {
                obtain2.readInt();
            }
            if (m25669k(readLong, 3)) {
                l = Long.valueOf(obtain2.readLong());
            }
            obtain2.recycle();
            return l;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            return null;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: IllegalAccessException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x0023] */
        @androidx.annotation.Nullable
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Long mo47637f(@androidx.annotation.NonNull android.view.accessibility.AccessibilityNodeInfo r6, int r7) {
            /*
                r5 = this;
                java.lang.reflect.Method r0 = r5.f18696d
                r1 = 0
                if (r0 != 0) goto L_0x000e
                java.lang.reflect.Field r0 = r5.f18697e
                if (r0 == 0) goto L_0x000d
                java.lang.reflect.Method r0 = r5.f18698f
                if (r0 != 0) goto L_0x000e
            L_0x000d:
                return r1
            L_0x000e:
                java.lang.reflect.Method r0 = r5.f18696d
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x0023
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{  }
                r3[r2] = r7     // Catch:{  }
                java.lang.Object r6 = r0.invoke(r6, r3)     // Catch:{  }
                java.lang.Long r6 = (java.lang.Long) r6     // Catch:{  }
                return r6
            L_0x0023:
                java.lang.reflect.Method r0 = r5.f18698f     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.reflect.Field r4 = r5.f18697e     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.Object r6 = r4.get(r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                r3[r2] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.Object r6 = r0.invoke(r6, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                long r6 = r6.longValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0042, IllegalAccessException | InvocationTargetException -> 0x0042 }
                return r6
            L_0x0042:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.view.AccessibilityViewEmbedder.C9451b.mo47637f(android.view.accessibility.AccessibilityNodeInfo, int):java.lang.Long");
        }

        @Nullable
        /* renamed from: g */
        public final Long mo47638g(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f18694b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return m25670l(accessibilityNodeInfo);
        }

        @Nullable
        /* renamed from: h */
        public final Long mo47639h(@NonNull AccessibilityRecord accessibilityRecord) {
            Method method = this.f18695c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        }

        @Nullable
        /* renamed from: i */
        public final Long mo47640i(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f18693a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.reflect.Field} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"PrivateApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9451b() {
            /*
                r9 = this;
                java.lang.String r0 = "getSourceNodeId"
                r9.<init>()
                r1 = 0
                r2 = 0
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r3 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0010 }
                java.lang.reflect.Method r3 = r3.getMethod(r0, r4)     // Catch:{ NoSuchMethodException -> 0x0010 }
                goto L_0x0011
            L_0x0010:
                r3 = r2
            L_0x0011:
                java.lang.Class<android.view.accessibility.AccessibilityRecord> r4 = android.view.accessibility.AccessibilityRecord.class
                java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x001a }
                java.lang.reflect.Method r0 = r4.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x001a }
                goto L_0x001b
            L_0x001a:
                r0 = r2
            L_0x001b:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 26
                r6 = 1
                if (r4 > r5) goto L_0x0043
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r5 = "getParentNodeId"
                java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002d }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ NoSuchMethodException -> 0x002d }
                goto L_0x002e
            L_0x002d:
                r4 = r2
            L_0x002e:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r7 = "getChildId"
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x003e }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x003e }
                r6[r1] = r8     // Catch:{ NoSuchMethodException -> 0x003e }
                java.lang.reflect.Method r1 = r5.getMethod(r7, r6)     // Catch:{ NoSuchMethodException -> 0x003e }
                r5 = r2
                goto L_0x0040
            L_0x003e:
                r1 = r2
                r5 = r1
            L_0x0040:
                r2 = r4
                r4 = r5
                goto L_0x0066
            L_0x0043:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r5 = "mChildNodeIds"
                java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                r4.setAccessible(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                java.lang.String r5 = "android.util.LongArray"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                java.lang.String r7 = "get"
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                r6[r1] = r8     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                java.lang.reflect.Method r1 = r5.getMethod(r7, r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0063 }
                r5 = r1
                r1 = r2
                goto L_0x0066
            L_0x0063:
                r1 = r2
                r4 = r1
                r5 = r4
            L_0x0066:
                r9.f18693a = r3
                r9.f18694b = r2
                r9.f18695c = r0
                r9.f18696d = r1
                r9.f18697e = r4
                r9.f18698f = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p630io.flutter.view.AccessibilityViewEmbedder.C9451b.<init>():void");
        }
    }

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$c */
    public static class C9452c {

        /* renamed from: a */
        public final View f18699a;

        /* renamed from: b */
        public final int f18700b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9452c)) {
                return false;
            }
            C9452c cVar = (C9452c) obj;
            if (this.f18700b != cVar.f18700b || !this.f18699a.equals(cVar.f18699a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f18699a.hashCode() + 31) * 31) + this.f18700b;
        }

        public C9452c(View view, int i) {
            this.f18699a = view;
            this.f18700b = i;
        }
    }

    public AccessibilityViewEmbedder(@NonNull View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long d = this.reflectionAccessors.mo47637f(accessibilityNodeInfo, i2);
            if (d != null) {
                int b = C9451b.m25668j(d.longValue());
                C9452c cVar = new C9452c(view, b);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, b, i3);
                    i = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
            }
        }
    }

    private void cacheVirtualIdMappings(@NonNull View view, int i, int i2) {
        C9452c cVar = new C9452c(view, i);
        this.originToFlutterId.put(cVar, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, cVar);
    }

    @NonNull
    private AccessibilityNodeInfo convertToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, int i, @NonNull View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        if (Build.VERSION.SDK_INT >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long c = this.reflectionAccessors.mo47638g(accessibilityNodeInfo);
        if (c != null) {
            Integer num = this.originToFlutterId.get(new C9452c(view, C9451b.m25668j(c.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void setFlutterNodesTranslateBounds(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull Rect rect, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    @Nullable
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        C9452c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f18699a) || cVar.f18699a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f18699a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f18700b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, cVar.f18699a);
    }

    @Nullable
    public Integer getRecordFlutterId(@NonNull View view, @NonNull AccessibilityRecord accessibilityRecord) {
        Long e = this.reflectionAccessors.mo47639h(accessibilityRecord);
        if (e == null) {
            return null;
        }
        return this.originToFlutterId.get(new C9452c(view, C9451b.m25668j(e.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(@NonNull View view, int i, @NonNull Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long a = this.reflectionAccessors.mo47640i(createAccessibilityNodeInfo);
        if (a == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, C9451b.m25668j(a.longValue()), i);
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public boolean onAccessibilityHoverEvent(int i, @NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C9452c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f18699a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
            motionEvent2.getPointerProperties(i2, pointerPropertiesArr[i2]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i2, pointerCoords);
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2].x -= (float) rect.left;
            pointerCoordsArr[i2].y -= (float) rect.top;
        }
        return cVar.f18699a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, @Nullable Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        C9452c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null || (accessibilityNodeProvider = cVar.f18699a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f18700b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        C9452c cVar = this.flutterIdToOrigin.get(i);
        if (cVar == null) {
            return null;
        }
        return cVar.f18699a;
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long e = this.reflectionAccessors.mo47639h(accessibilityEvent);
        if (e == null) {
            return false;
        }
        int b = C9451b.m25668j(e.longValue());
        Integer num = this.originToFlutterId.get(new C9452c(view, b));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            num = Integer.valueOf(i);
            cacheVirtualIdMappings(view, b, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
            AccessibilityRecord record = obtain.getRecord(i2);
            Long e2 = this.reflectionAccessors.mo47639h(record);
            if (e2 == null) {
                return false;
            }
            C9452c cVar = new C9452c(view, C9451b.m25668j(e2.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
