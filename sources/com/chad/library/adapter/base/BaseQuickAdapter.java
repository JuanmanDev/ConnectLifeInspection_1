package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapterModuleImp;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p111f.p112a.p113a.p114a.p116b.C1985a;
import p040c.p111f.p112a.p113a.p114a.p116b.C1986b;
import p040c.p111f.p112a.p113a.p114a.p116b.C1987c;
import p040c.p111f.p112a.p113a.p114a.p116b.C1988d;
import p040c.p111f.p112a.p113a.p114a.p116b.C1990f;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 ª\u0002*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u00042\u00020\u0005:\u0004«\u0002ª\u0002B'\b\u0007\u0012\b\b\u0001\u00109\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010o¢\u0006\u0006\b¨\u0002\u0010©\u0002J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\b\u0001\u0010\r\u001a\u00020\u000b\"\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\b2\f\b\u0001\u0010\r\u001a\u00020\u000b\"\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J'\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u001f\u0010\u0012\u001a\u00020\b2\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u0019J+\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\fH\u0004¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010*\u001a\u00028\u0000H$¢\u0006\u0004\b+\u0010,J-\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010*\u001a\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0014¢\u0006\u0004\b+\u00100J%\u00103\u001a\u0004\u0018\u00018\u00012\n\u00102\u001a\u0006\u0012\u0002\b\u0003012\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00028\u00012\u0006\u00108\u001a\u0002072\b\b\u0001\u00109\u001a\u00020\fH\u0014¢\u0006\u0004\b5\u0010:J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0;¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0;¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\fH\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000CH\u0007¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0004\bF\u0010EJ!\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u0001012\n\u00102\u001a\u0006\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00028\u00002\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010@J\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u001b\u0010O\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\bO\u0010JJ\u0019\u0010P\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\bR\u0010BJ\u000f\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u0004\u0018\u00010V¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u0004\u0018\u00010Y¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010_\u001a\u00020\f¢\u0006\u0004\b`\u0010aJ\r\u0010c\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020b¢\u0006\u0004\be\u0010dJ\r\u0010f\u001a\u00020b¢\u0006\u0004\bf\u0010dJ\u0017\u0010h\u001a\u00020b2\u0006\u0010g\u001a\u00020\fH\u0014¢\u0006\u0004\bh\u0010iJ\u0017\u0010l\u001a\u00020\b2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\bn\u0010$J-\u0010n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0oH\u0016¢\u0006\u0004\bn\u0010pJ\u001f\u0010q\u001a\u00028\u00012\u0006\u00108\u001a\u0002072\u0006\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\bq\u0010:J\u001f\u0010r\u001a\u00028\u00012\u0006\u00108\u001a\u0002072\u0006\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\br\u0010:J\u0017\u0010s\u001a\u00020\b2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bs\u0010mJ\u001f\u0010t\u001a\u00020\b2\u0006\u0010!\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\bt\u0010$J\u0017\u0010u\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\bw\u0010\u0013J\u0019\u0010w\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0017¢\u0006\u0004\bw\u0010)J\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010&J\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010&J\u0019\u0010z\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\bz\u0010)J\r\u0010{\u001a\u00020\b¢\u0006\u0004\b{\u0010&J\u0015\u0010}\u001a\u00020\b2\u0006\u0010|\u001a\u00020\u001a¢\u0006\u0004\b}\u0010~J\u0017\u0010\u0001\u001a\u00020\b2\u0006\u0010\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010~J\u001f\u0010\u0001\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0017¢\u0006\u0005\b\u0001\u0010\u0019J\u001a\u0010\u0001\u001a\u00020\b2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0005\b\u0001\u0010\u0015J \u0010\u0001\u001a\u00020\b2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0001\u0010\u0001J \u0010\u0001\u001a\u00020\b2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020\b2\n\b\u0001\u0010\u0001\u001a\u00030\u00012\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000oH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\b2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010oH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00020\b2\u0007\u0010\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0001\u0010~J\u0017\u0010\u0001\u001a\u00020\b2\u0006\u00109\u001a\u00020\f¢\u0006\u0005\b\u0001\u0010)J-\u0010\u0001\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0005\b\u0001\u0010\u001fJ\u0019\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0001\u0010\nJ\u001e\u0010\u0001\u001a\u00020\b2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0005\b\u0001\u0010\u001fJ\"\u0010\u0001\u001a\u00020\b2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0016¢\u0006\u0005\b\u0001\u0010\u0019J\"\u0010\u0001\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010oH\u0017¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010 \u0001\u001a\u00020\b2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010oH\u0016¢\u0006\u0006\b \u0001\u0010\u0001J#\u0010¢\u0001\u001a\u00020\b2\u0007\u0010¡\u0001\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001d\u0010¥\u0001\u001a\u00020\b2\t\u0010¤\u0001\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J#\u0010§\u0001\u001a\u00020b2\u0007\u0010¡\u0001\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001d\u0010©\u0001\u001a\u00020\b2\t\u0010¤\u0001\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J#\u0010«\u0001\u001a\u00020\b2\u0007\u0010¡\u0001\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0006\b«\u0001\u0010£\u0001J\u001d\u0010¬\u0001\u001a\u00020\b2\t\u0010¤\u0001\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0006\b¬\u0001\u0010­\u0001J#\u0010®\u0001\u001a\u00020b2\u0007\u0010¡\u0001\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0006\b®\u0001\u0010¨\u0001J\u001d\u0010¯\u0001\u001a\u00020\b2\t\u0010¤\u0001\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J$\u0010³\u0001\u001a\u00020\b2\b\u0010²\u0001\u001a\u00030±\u00012\u0006\u0010\u001c\u001a\u00020\fH\u0014¢\u0006\u0006\b³\u0001\u0010´\u0001R8\u0010·\u0001\u001a\u0005\u0018\u00010µ\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u00018\u0006@FX\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R(\u0010½\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010d\"\u0006\bÀ\u0001\u0010Á\u0001R\u001f\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\f0;8\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001f\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\f0;8\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R,\u0010Ç\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Å\u00018\u0004@BX.¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000o2\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000o8\u0006@@X\u000e¢\u0006\u0017\n\u0005\b\u0011\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010\u0001R\u0017\u0010Ò\u0001\u001a\u00030Ï\u00018F@\u0006¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ö\u0001\u001a\u0005\u0018\u00010Ó\u00018F@\u0006¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ú\u0001\u001a\u0005\u0018\u00010×\u00018F@\u0006¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0015\u0010Ü\u0001\u001a\u00020\f8F@\u0006¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010@R(\u0010Ý\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bÝ\u0001\u0010¾\u0001\u001a\u0005\bÞ\u0001\u0010d\"\u0006\bß\u0001\u0010Á\u0001R\u0015\u0010á\u0001\u001a\u00020\f8F@\u0006¢\u0006\u0007\u001a\u0005\bà\u0001\u0010@R(\u0010â\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bâ\u0001\u0010¾\u0001\u001a\u0005\bã\u0001\u0010d\"\u0006\bä\u0001\u0010Á\u0001R\u0019\u0010æ\u0001\u001a\u0005\u0018\u00010×\u00018F@\u0006¢\u0006\b\u001a\u0006\bå\u0001\u0010Ù\u0001R\u0015\u0010è\u0001\u001a\u00020\f8F@\u0006¢\u0006\u0007\u001a\u0005\bç\u0001\u0010@R(\u0010é\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bé\u0001\u0010¾\u0001\u001a\u0005\bê\u0001\u0010d\"\u0006\bë\u0001\u0010Á\u0001R\u0015\u0010í\u0001\u001a\u00020\f8F@\u0006¢\u0006\u0007\u001a\u0005\bì\u0001\u0010@R(\u0010î\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bî\u0001\u0010¾\u0001\u001a\u0005\bï\u0001\u0010d\"\u0006\bð\u0001\u0010Á\u0001R(\u0010ñ\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bñ\u0001\u0010¾\u0001\u001a\u0005\bñ\u0001\u0010d\"\u0006\bò\u0001\u0010Á\u0001R(\u0010ó\u0001\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\bó\u0001\u0010¾\u0001\u001a\u0005\bó\u0001\u0010d\"\u0006\bô\u0001\u0010Á\u0001R\u0017\u00109\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0007\n\u0005\b9\u0010õ\u0001R\u0017\u0010ù\u0001\u001a\u00030ö\u00018F@\u0006¢\u0006\b\u001a\u0006\b÷\u0001\u0010ø\u0001R!\u0010ú\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u001c\u0010ü\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001a\u0010þ\u0001\u001a\u00030Ó\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001a\u0010\u0002\u001a\u00030×\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u00030×\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010õ\u0001R,\u0010\u0002\u001a\u0005\u0018\u00010ö\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010ø\u0001\"\u0006\b\u0002\u0010\u0002R\u001b\u0010\u0002\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001b\u0010\u0002\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001b\u0010\u0002\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001b\u0010\u0002\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0005\b\u0002\u0010mR\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R(\u0010k\u001a\u00020j2\u0007\u0010¶\u0001\u001a\u00020j8F@FX\u000e¢\u0006\u000f\u001a\u0006\b\u0002\u0010\u0002\"\u0005\b\u0002\u0010mR\u0017\u0010\u0002\u001a\u00030\u00028F@\u0006¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R7\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020j0 \u00028\u0006@\u0006X.¢\u0006\u001f\n\u0006\b¡\u0002\u0010¢\u0002\u0012\u0005\b§\u0002\u0010&\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002¨\u0006¬\u0002"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseQuickAdapterModuleImp;", "androidx/recyclerview/widget/RecyclerView$Adapter", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "addAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "", "", "viewIds", "addChildClickViewIds", "([I)V", "addChildLongClickViewIds", "data", "addData", "(Ljava/lang/Object;)V", "position", "(ILjava/lang/Object;)V", "", "newData", "(ILjava/util/Collection;)V", "(Ljava/util/Collection;)V", "Landroid/view/View;", "view", "index", "orientation", "addFooterView", "(Landroid/view/View;II)I", "addHeaderView", "viewHolder", "viewType", "bindViewClickListener", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "checkModule", "()V", "size", "compatibilityDataSizeChanged", "(I)V", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Ljava/lang/Class;", "z", "createBaseGenericKInstance", "(Ljava/lang/Class;Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "createBaseViewHolder", "(Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/view/ViewGroup;", "parent", "layoutResId", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Ljava/util/LinkedHashSet;", "getChildClickViewIds", "()Ljava/util/LinkedHashSet;", "getChildLongClickViewIds", "getDefItemCount", "()I", "getDefItemViewType", "(I)I", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffHelper", "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffer", "getInstancedGenericKClass", "(Ljava/lang/Class;)Ljava/lang/Class;", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "", "getItemId", "(I)J", "getItemOrNull", "getItemPosition", "(Ljava/lang/Object;)I", "getItemViewType", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "getOnItemChildClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "getOnItemChildLongClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "getOnItemClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "getOnItemLongClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "viewId", "getViewByPosition", "(II)Landroid/view/View;", "", "hasEmptyView", "()Z", "hasFooterLayout", "hasHeaderLayout", "type", "isFixedViewType", "(I)Z", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onBindViewHolder", "", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "onCreateDefViewHolder", "onCreateViewHolder", "onDetachedFromRecyclerView", "onItemViewHolderCreated", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "remove", "removeAllFooterView", "removeAllHeaderView", "removeAt", "removeEmptyView", "footer", "removeFooterView", "(Landroid/view/View;)V", "header", "removeHeaderView", "replaceData", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "animationType", "setAnimationWithDefault", "(Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;)V", "setData", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "setDiffCallback", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "config", "setDiffConfig", "(Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diffResult", "list", "setDiffNewData", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Ljava/util/List;)V", "(Ljava/util/List;)V", "emptyView", "setEmptyView", "setFooterView", "setFullSpan", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "spanSizeLookup", "setGridSpanSizeLookup", "(Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;)V", "setHeaderView", "setList", "setNewData", "setNewInstance", "v", "setOnItemChildClick", "(Landroid/view/View;I)V", "listener", "setOnItemChildClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;)V", "setOnItemChildLongClick", "(Landroid/view/View;I)Z", "setOnItemChildLongClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;)V", "setOnItemClick", "setOnItemClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemClickListener;)V", "setOnItemLongClick", "setOnItemLongClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;)V", "Landroid/animation/Animator;", "anim", "startAnim", "(Landroid/animation/Animator;I)V", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "value", "adapterAnimation", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "getAdapterAnimation", "()Lcom/chad/library/adapter/base/animation/BaseAnimation;", "setAdapterAnimation", "(Lcom/chad/library/adapter/base/animation/BaseAnimation;)V", "animationEnable", "Z", "getAnimationEnable", "setAnimationEnable", "(Z)V", "childClickViewIds", "Ljava/util/LinkedHashSet;", "childLongClickViewIds", "Landroid/content/Context;", "<set-?>", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData$com_github_CymChad_brvah", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "getDraggableModule", "()Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "draggableModule", "Landroid/widget/FrameLayout;", "getEmptyLayout", "()Landroid/widget/FrameLayout;", "emptyLayout", "Landroid/widget/LinearLayout;", "getFooterLayout", "()Landroid/widget/LinearLayout;", "footerLayout", "getFooterLayoutCount", "footerLayoutCount", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "getFooterViewPosition", "footerViewPosition", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "getHeaderLayout", "headerLayout", "getHeaderLayoutCount", "headerLayoutCount", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "getHeaderViewPosition", "headerViewPosition", "headerWithEmptyEnable", "getHeaderWithEmptyEnable", "setHeaderWithEmptyEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "isUseEmpty", "setUseEmpty", "I", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "getLoadMoreModule", "()Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "loadMoreModule", "mDiffHelper", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "mDraggableModule", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "mEmptyLayout", "Landroid/widget/FrameLayout;", "mFooterLayout", "Landroid/widget/LinearLayout;", "mHeaderLayout", "mLastPosition", "mLoadMoreModule", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "getMLoadMoreModule$com_github_CymChad_brvah", "setMLoadMoreModule$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;)V", "mOnItemChildClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "mOnItemChildLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "mOnItemClickListener", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "mOnItemLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView$com_github_CymChad_brvah", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView$com_github_CymChad_brvah", "mSpanSizeLookup", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "mUpFetchModule", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "getRecyclerView", "setRecyclerView", "getUpFetchModule", "()Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "upFetchModule", "Ljava/lang/ref/WeakReference;", "weakRecyclerView", "Ljava/lang/ref/WeakReference;", "getWeakRecyclerView", "()Ljava/lang/ref/WeakReference;", "setWeakRecyclerView", "(Ljava/lang/ref/WeakReference;)V", "weakRecyclerView$annotations", "<init>", "(ILjava/util/List;)V", "Companion", "AnimationType", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseQuickAdapter.kt */
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.Adapter<VH> implements BaseQuickAdapterModuleImp {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;
    @Nullable
    public BaseAnimation adapterAnimation;
    public boolean animationEnable;
    public final LinkedHashSet<Integer> childClickViewIds;
    public final LinkedHashSet<Integer> childLongClickViewIds;
    @NotNull
    public Context context;
    @NotNull
    public List<T> data;
    public boolean footerViewAsFlow;
    public boolean footerWithEmptyEnable;
    public boolean headerViewAsFlow;
    public boolean headerWithEmptyEnable;
    public boolean isAnimationFirstOnly;
    public boolean isUseEmpty;
    public final int layoutResId;
    public BrvahAsyncDiffer<T> mDiffHelper;
    public BaseDraggableModule mDraggableModule;
    public FrameLayout mEmptyLayout;
    public LinearLayout mFooterLayout;
    public LinearLayout mHeaderLayout;
    public int mLastPosition;
    @Nullable
    public BaseLoadMoreModule mLoadMoreModule;
    public C1986b mOnItemChildClickListener;
    public C1987c mOnItemChildLongClickListener;
    public C1988d mOnItemClickListener;
    public C1990f mOnItemLongClickListener;
    @Nullable
    public RecyclerView mRecyclerView;
    public C1985a mSpanSizeLookup;
    public BaseUpFetchModule mUpFetchModule;
    @NotNull
    public WeakReference<RecyclerView> weakRecyclerView;

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: BaseQuickAdapter.kt */
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003¨\u0006\t"}, mo47991d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$Companion;", "", "EMPTY_VIEW", "I", "FOOTER_VIEW", "HEADER_VIEW", "LOAD_MORE_VIEW", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    /* compiled from: BaseQuickAdapter.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {}, mo47991d2 = {}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AnimationType.AlphaIn.ordinal()] = 1;
            $EnumSwitchMapping$0[AnimationType.ScaleIn.ordinal()] = 2;
            $EnumSwitchMapping$0[AnimationType.SlideInBottom.ordinal()] = 3;
            $EnumSwitchMapping$0[AnimationType.SlideInLeft.ordinal()] = 4;
            $EnumSwitchMapping$0[AnimationType.SlideInRight.ordinal()] = 5;
        }
    }

    @JvmOverloads
    public BaseQuickAdapter(@LayoutRes int i) {
        this(i, (List) null, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseQuickAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    public static final /* synthetic */ FrameLayout access$getMEmptyLayout$p(BaseQuickAdapter baseQuickAdapter) {
        FrameLayout frameLayout = baseQuickAdapter.mEmptyLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMFooterLayout$p(BaseQuickAdapter baseQuickAdapter) {
        LinearLayout linearLayout = baseQuickAdapter.mFooterLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return linearLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMHeaderLayout$p(BaseQuickAdapter baseQuickAdapter) {
        LinearLayout linearLayout = baseQuickAdapter.mHeaderLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return linearLayout;
    }

    private final void addAnimation(RecyclerView.ViewHolder viewHolder) {
        if (!this.animationEnable) {
            return;
        }
        if (!this.isAnimationFirstOnly || viewHolder.getLayoutPosition() > this.mLastPosition) {
            BaseAnimation baseAnimation = this.adapterAnimation;
            if (baseAnimation == null) {
                baseAnimation = new AlphaInAnimation(0.0f, 1, (DefaultConstructorMarker) null);
            }
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            for (Animator startAnim : baseAnimation.animators(view)) {
                startAnim(startAnim, viewHolder.getLayoutPosition());
            }
            this.mLastPosition = viewHolder.getLayoutPosition();
        }
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = -1;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return baseQuickAdapter.addFooterView(view, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = -1;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return baseQuickAdapter.addHeaderView(view, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
    }

    private final void checkModule() {
    }

    private final VH createBaseGenericKInstance(Class<?> cls, View view) {
        try {
            if (cls.isMemberClass()) {
                if (!Modifier.isStatic(cls.getModifiers())) {
                    Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[]{getClass(), View.class});
                    Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "z.getDeclaredConstructor…aClass, View::class.java)");
                    declaredConstructor.setAccessible(true);
                    VH newInstance = declaredConstructor.newInstance(new Object[]{this, view});
                    if (newInstance != null) {
                        return (BaseViewHolder) newInstance;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type VH");
                }
            }
            Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(new Class[]{View.class});
            Intrinsics.checkExpressionValueIsNotNull(declaredConstructor2, "z.getDeclaredConstructor(View::class.java)");
            declaredConstructor2.setAccessible(true);
            VH newInstance2 = declaredConstructor2.newInstance(new Object[]{view});
            if (newInstance2 != null) {
                return (BaseViewHolder) newInstance2;
            }
            throw new TypeCastException("null cannot be cast to non-null type VH");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> cls) {
        Class<BaseViewHolder> cls2 = BaseViewHolder.class;
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "type.actualTypeArguments");
            for (Type type : actualTypeArguments) {
                if (type instanceof Class) {
                    if (cls2.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    Intrinsics.checkExpressionValueIsNotNull(rawType, "temp.rawType");
                    if ((rawType instanceof Class) && cls2.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (GenericSignatureFormatError e) {
            e.printStackTrace();
            return null;
        } catch (TypeNotPresentException e2) {
            e2.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return baseQuickAdapter.setFooterView(view, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFooterView");
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return baseQuickAdapter.setHeaderView(view, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderView");
    }

    @Deprecated(message = "Please use recyclerView", replaceWith = @ReplaceWith(expression = "recyclerView", imports = {}))
    public static /* synthetic */ void weakRecyclerView$annotations() {
    }

    public final void addChildClickViewIds(@NotNull @IdRes int... iArr) {
        for (int valueOf : iArr) {
            this.childClickViewIds.add(Integer.valueOf(valueOf));
        }
    }

    public final void addChildLongClickViewIds(@NotNull @IdRes int... iArr) {
        for (int valueOf : iArr) {
            this.childLongClickViewIds.add(Integer.valueOf(valueOf));
        }
    }

    public void addData(@IntRange(from = 0) int i, T t) {
        this.data.add(i, t);
        notifyItemInserted(i + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    @NotNull
    public BaseDraggableModule addDraggableModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return BaseQuickAdapterModuleImp.DefaultImpls.addDraggableModule(this, baseQuickAdapter);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view) {
        return addFooterView$default(this, view, 0, 0, 6, (Object) null);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int i) {
        return addFooterView$default(this, view, i, 0, 4, (Object) null);
    }

    @JvmOverloads
    public final int addFooterView(@NotNull View view, int i, int i2) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.setOrientation(i2);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (i2 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.mFooterLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        int childCount = linearLayout3.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        linearLayout4.addView(view, i);
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        if (linearLayout5.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i;
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view) {
        return addHeaderView$default(this, view, 0, 0, 6, (Object) null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int i) {
        return addHeaderView$default(this, view, i, 0, 4, (Object) null);
    }

    @JvmOverloads
    public final int addHeaderView(@NotNull View view, int i, int i2) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.setOrientation(i2);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (i2 == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.mHeaderLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        int childCount = linearLayout3.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        linearLayout4.addView(view, i);
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        if (linearLayout5.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i;
    }

    @NotNull
    public BaseLoadMoreModule addLoadMoreModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return BaseQuickAdapterModuleImp.DefaultImpls.addLoadMoreModule(this, baseQuickAdapter);
    }

    @NotNull
    public BaseUpFetchModule addUpFetchModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return BaseQuickAdapterModuleImp.DefaultImpls.addUpFetchModule(this, baseQuickAdapter);
    }

    public void bindViewClickListener(@NotNull VH vh, int i) {
        if (this.mOnItemClickListener != null) {
            vh.itemView.setOnClickListener(new BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$1(this, vh));
        }
        if (this.mOnItemLongClickListener != null) {
            vh.itemView.setOnLongClickListener(new BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$2(this, vh));
        }
        if (this.mOnItemChildClickListener != null) {
            Iterator it = getChildClickViewIds().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                View view = vh.itemView;
                Intrinsics.checkExpressionValueIsNotNull(num, "id");
                View findViewById = view.findViewById(num.intValue());
                if (findViewById != null) {
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$3(this, vh));
                }
            }
        }
        if (this.mOnItemChildLongClickListener != null) {
            Iterator it2 = getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                View view2 = vh.itemView;
                Intrinsics.checkExpressionValueIsNotNull(num2, "id");
                View findViewById2 = view2.findViewById(num2.intValue());
                if (findViewById2 != null) {
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$4(this, vh));
                }
            }
        }
    }

    public final void compatibilityDataSizeChanged(int i) {
        if (this.data.size() == i) {
            notifyDataSetChanged();
        }
    }

    public abstract void convert(@NotNull VH vh, T t);

    public void convert(@NotNull VH vh, T t, @NotNull List<? extends Object> list) {
    }

    @NotNull
    public VH createBaseViewHolder(@NotNull ViewGroup viewGroup, @LayoutRes int i) {
        return createBaseViewHolder(AdapterUtilsKt.getItemView(viewGroup, i));
    }

    @Nullable
    public final BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @NotNull
    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    @NotNull
    public final Context getContext() {
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    @NotNull
    public final List<T> getData() {
        return this.data;
    }

    public int getDefItemCount() {
        return this.data.size();
    }

    public int getDefItemViewType(int i) {
        return super.getItemViewType(i);
    }

    @NotNull
    @Deprecated(message = "User getDiffer()", replaceWith = @ReplaceWith(expression = "getDiffer()", imports = {}))
    public final BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    @NotNull
    public final BrvahAsyncDiffer<T> getDiffer() {
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            if (brvahAsyncDiffer == null) {
                Intrinsics.throwNpe();
            }
            return brvahAsyncDiffer;
        }
        throw new IllegalStateException("Please use setDiffCallback() or setDiffConfig() first!".toString());
    }

    @NotNull
    public final BaseDraggableModule getDraggableModule() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            if (baseDraggableModule == null) {
                Intrinsics.throwNpe();
            }
            return baseDraggableModule;
        }
        throw new IllegalStateException("Please first implements DraggableModule".toString());
    }

    @Nullable
    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        return frameLayout;
    }

    @Nullable
    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        return linearLayout;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return getHeaderLayoutCount() + this.data.size();
        }
        int i = 1;
        if (this.headerWithEmptyEnable && hasHeaderLayout()) {
            i = 2;
        }
        if (this.footerWithEmptyEnable) {
            return i;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    @Nullable
    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        return linearLayout;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        if (!hasEmptyView() || this.headerWithEmptyEnable) {
            return 0;
        }
        return -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(@IntRange(from = 0) int i) {
        return this.data.get(i);
    }

    public int getItemCount() {
        int i = 1;
        if (hasEmptyView()) {
            if (this.headerWithEmptyEnable && hasHeaderLayout()) {
                i = 2;
            }
            return (!this.footerWithEmptyEnable || !hasFooterLayout()) ? i : i + 1;
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule == null || !baseLoadMoreModule.hasLoadMoreView()) {
            i = 0;
        }
        return getHeaderLayoutCount() + getDefItemCount() + getFooterLayoutCount() + i;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    @Nullable
    public T getItemOrNull(@IntRange(from = 0) int i) {
        return CollectionsKt___CollectionsKt.getOrNull(this.data, i);
    }

    public int getItemPosition(@Nullable T t) {
        if (t == null || !(!this.data.isEmpty())) {
            return -1;
        }
        return this.data.indexOf(t);
    }

    public int getItemViewType(int i) {
        if (hasEmptyView()) {
            boolean z = this.headerWithEmptyEnable && hasHeaderLayout();
            if (i != 0) {
                if (i != 1) {
                }
                return FOOTER_VIEW;
            } else if (z) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        boolean hasHeaderLayout = hasHeaderLayout();
        if (hasHeaderLayout && i == 0) {
            return HEADER_VIEW;
        }
        if (hasHeaderLayout) {
            i--;
        }
        int size = this.data.size();
        if (i < size) {
            return getDefItemViewType(i);
        }
        if (i - size < hasFooterLayout()) {
            return FOOTER_VIEW;
        }
        return LOAD_MORE_VIEW;
    }

    @NotNull
    public final BaseLoadMoreModule getLoadMoreModule() {
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            if (baseLoadMoreModule == null) {
                Intrinsics.throwNpe();
            }
            return baseLoadMoreModule;
        }
        throw new IllegalStateException("Please first implements LoadMoreModule".toString());
    }

    @Nullable
    public final BaseLoadMoreModule getMLoadMoreModule$com_github_CymChad_brvah() {
        return this.mLoadMoreModule;
    }

    @Nullable
    public final RecyclerView getMRecyclerView$com_github_CymChad_brvah() {
        return this.mRecyclerView;
    }

    @Nullable
    public final C1986b getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    @Nullable
    public final C1987c getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    @Nullable
    public final C1988d getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Nullable
    public final C1990f getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            if (recyclerView == null) {
                Intrinsics.throwNpe();
            }
            return recyclerView;
        }
        throw new IllegalStateException("Please get it after onAttachedToRecyclerView()".toString());
    }

    @NotNull
    public final BaseUpFetchModule getUpFetchModule() {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            if (baseUpFetchModule == null) {
                Intrinsics.throwNpe();
            }
            return baseUpFetchModule;
        }
        throw new IllegalStateException("Please first implements UpFetchModule".toString());
    }

    @Nullable
    public final View getViewByPosition(int i, @IdRes int i2) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(i2);
    }

    @NotNull
    public final WeakReference<RecyclerView> getWeakRecyclerView() {
        WeakReference<RecyclerView> weakReference = this.weakRecyclerView;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("weakRecyclerView");
        }
        return weakReference;
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean isAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public boolean isFixedViewType(int i) {
        return i == 268436821 || i == 268435729 || i == 268436275 || i == 268436002;
    }

    public final boolean isUseEmpty() {
        return this.isUseEmpty;
    }

    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.weakRecyclerView = new WeakReference<>(recyclerView);
        this.mRecyclerView = recyclerView;
        Context context2 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "recyclerView.context");
        this.context = context2;
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.attachToRecyclerView(recyclerView);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new BaseQuickAdapter$onAttachedToRecyclerView$1(this, layoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @NotNull
    public VH onCreateDefViewHolder(@NotNull ViewGroup viewGroup, int i) {
        return createBaseViewHolder(viewGroup, this.layoutResId);
    }

    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.mRecyclerView = null;
    }

    public void onItemViewHolderCreated(@NotNull VH vh, int i) {
    }

    @Deprecated(message = "Please use removeAt()", replaceWith = @ReplaceWith(expression = "removeAt(position)", imports = {}))
    public void remove(@IntRange(from = 0) int i) {
        removeAt(i);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@IntRange(from = 0) int i) {
        if (i < this.data.size()) {
            this.data.remove(i);
            int headerLayoutCount = i + getHeaderLayoutCount();
            notifyItemRemoved(headerLayoutCount);
            compatibilityDataSizeChanged(0);
            notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
        }
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(@NotNull View view) {
        int footerViewPosition;
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            linearLayout.removeView(view);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (linearLayout2.getChildCount() == 0 && (footerViewPosition = getFooterViewPosition()) != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeHeaderView(@NotNull View view) {
        int headerViewPosition;
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            linearLayout.removeView(view);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (linearLayout2.getChildCount() == 0 && (headerViewPosition = getHeaderViewPosition()) != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    @Deprecated(message = "Please use setData()", replaceWith = @ReplaceWith(expression = "setData(newData)", imports = {}))
    public void replaceData(@NotNull Collection<? extends T> collection) {
        setList(collection);
    }

    public final void setAdapterAnimation(@Nullable BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.isAnimationFirstOnly = z;
    }

    public final void setAnimationWithDefault(@NotNull AnimationType animationType) {
        BaseAnimation baseAnimation;
        int i = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i == 1) {
            baseAnimation = new AlphaInAnimation(0.0f, 1, (DefaultConstructorMarker) null);
        } else if (i == 2) {
            baseAnimation = new ScaleInAnimation(0.0f, 1, (DefaultConstructorMarker) null);
        } else if (i == 3) {
            baseAnimation = new SlideInBottomAnimation();
        } else if (i == 4) {
            baseAnimation = new SlideInLeftAnimation();
        } else if (i == 5) {
            baseAnimation = new SlideInRightAnimation();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setAdapterAnimation(baseAnimation);
    }

    public void setData(@IntRange(from = 0) int i, T t) {
        if (i < this.data.size()) {
            this.data.set(i, t);
            notifyItemChanged(i + getHeaderLayoutCount());
        }
    }

    public final void setData$com_github_CymChad_brvah(@NotNull List<T> list) {
        this.data = list;
    }

    public final void setDiffCallback(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        setDiffConfig(new BrvahAsyncDifferConfig.Builder(itemCallback).build());
    }

    public final void setDiffConfig(@NotNull BrvahAsyncDifferConfig<T> brvahAsyncDifferConfig) {
        this.mDiffHelper = new BrvahAsyncDiffer<>(this, brvahAsyncDifferConfig);
    }

    public void setDiffNewData(@Nullable List<T> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            BrvahAsyncDiffer.submitList$default(brvahAsyncDiffer, list, (Runnable) null, 2, (Object) null);
        }
    }

    public final void setEmptyView(@NotNull View view) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        int itemCount = getItemCount();
        int i = 0;
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            this.mEmptyLayout = frameLayout;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new ViewGroup.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            frameLayout.setLayoutParams(layoutParams);
            z = true;
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout frameLayout2 = this.mEmptyLayout;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                layoutParams4.width = layoutParams3.width;
                layoutParams4.height = layoutParams3.height;
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                frameLayout3.setLayoutParams(layoutParams4);
            }
            z = false;
        }
        FrameLayout frameLayout4 = this.mEmptyLayout;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        frameLayout4.removeAllViews();
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
        }
        frameLayout5.addView(view);
        this.isUseEmpty = true;
        if (z && hasEmptyView()) {
            if (this.headerWithEmptyEnable && hasHeaderLayout()) {
                i = 1;
            }
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view) {
        return setFooterView$default(this, view, 0, 0, 6, (Object) null);
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int i) {
        return setFooterView$default(this, view, i, 0, 4, (Object) null);
    }

    @JvmOverloads
    public final int setFooterView(@NotNull View view, int i, int i2) {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
            }
            if (linearLayout.getChildCount() > i) {
                LinearLayout linearLayout2 = this.mFooterLayout;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                linearLayout2.removeViewAt(i);
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                linearLayout3.addView(view, i);
                return i;
            }
        }
        return addFooterView(view, i, i2);
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.footerWithEmptyEnable = z;
    }

    public void setFullSpan(@NotNull RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    public void setGridSpanSizeLookup(@Nullable C1985a aVar) {
        this.mSpanSizeLookup = aVar;
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view) {
        return setHeaderView$default(this, view, 0, 0, 6, (Object) null);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int i) {
        return setHeaderView$default(this, view, i, 0, 4, (Object) null);
    }

    @JvmOverloads
    public final int setHeaderView(@NotNull View view, int i, int i2) {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
            }
            if (linearLayout.getChildCount() > i) {
                LinearLayout linearLayout2 = this.mHeaderLayout;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                linearLayout2.removeViewAt(i);
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                linearLayout3.addView(view, i);
                return i;
            }
        }
        return addHeaderView(view, i, i2);
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.headerWithEmptyEnable = z;
    }

    public void setList(@Nullable Collection<? extends T> collection) {
        List<T> list = this.data;
        boolean z = false;
        if (collection != list) {
            list.clear();
            if (collection == null || collection.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.data.addAll(collection);
            }
        } else {
            if (collection == null || collection.isEmpty()) {
                z = true;
            }
            if (!z) {
                ArrayList arrayList = new ArrayList(collection);
                this.data.clear();
                this.data.addAll(arrayList);
            } else {
                this.data.clear();
            }
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(@Nullable BaseLoadMoreModule baseLoadMoreModule) {
        this.mLoadMoreModule = baseLoadMoreModule;
    }

    public final void setMRecyclerView$com_github_CymChad_brvah(@Nullable RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    @Deprecated(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @ReplaceWith(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(@Nullable List<T> list) {
        setNewInstance(list);
    }

    public void setNewInstance(@Nullable List<T> list) {
        if (list != this.data) {
            if (list == null) {
                list = new ArrayList<>();
            }
            this.data = list;
            BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
            if (baseLoadMoreModule != null) {
                baseLoadMoreModule.reset$com_github_CymChad_brvah();
            }
            this.mLastPosition = -1;
            notifyDataSetChanged();
            BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
            if (baseLoadMoreModule2 != null) {
                baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
            }
        }
    }

    public void setOnItemChildClick(@NotNull View view, int i) {
        C1986b bVar = this.mOnItemChildClickListener;
        if (bVar != null) {
            bVar.mo16543a(this, view, i);
        }
    }

    public void setOnItemChildClickListener(@Nullable C1986b bVar) {
        this.mOnItemChildClickListener = bVar;
    }

    public boolean setOnItemChildLongClick(@NotNull View view, int i) {
        C1987c cVar = this.mOnItemChildLongClickListener;
        if (cVar != null) {
            return cVar.mo16544a(this, view, i);
        }
        return false;
    }

    public void setOnItemChildLongClickListener(@Nullable C1987c cVar) {
        this.mOnItemChildLongClickListener = cVar;
    }

    public void setOnItemClick(@NotNull View view, int i) {
        C1988d dVar = this.mOnItemClickListener;
        if (dVar != null) {
            dVar.mo16545a(this, view, i);
        }
    }

    public void setOnItemClickListener(@Nullable C1988d dVar) {
        this.mOnItemClickListener = dVar;
    }

    public boolean setOnItemLongClick(@NotNull View view, int i) {
        C1990f fVar = this.mOnItemLongClickListener;
        if (fVar != null) {
            return fVar.mo16549a(this, view, i);
        }
        return false;
    }

    public void setOnItemLongClickListener(@Nullable C1990f fVar) {
        this.mOnItemLongClickListener = fVar;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    public final void setUseEmpty(boolean z) {
        this.isUseEmpty = z;
    }

    public final void setWeakRecyclerView(@NotNull WeakReference<RecyclerView> weakReference) {
        this.weakRecyclerView = weakReference;
    }

    public void startAnim(@NotNull Animator animator, int i) {
        animator.start();
    }

    @JvmOverloads
    public BaseQuickAdapter(@LayoutRes int i, @Nullable List<T> list) {
        this.layoutResId = i;
        this.data = list == null ? new ArrayList<>() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    @NotNull
    public VH createBaseViewHolder(@NotNull View view) {
        VH vh;
        Class cls = getClass();
        Class<?> cls2 = null;
        while (cls2 == null && cls != null) {
            cls2 = getInstancedGenericKClass(cls);
            cls = cls.getSuperclass();
        }
        if (cls2 == null) {
            vh = new BaseViewHolder(view);
        } else {
            vh = createBaseGenericKInstance(cls2, view);
        }
        return vh != null ? vh : new BaseViewHolder(view);
    }

    @NotNull
    public VH onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        switch (i) {
            case HEADER_VIEW /*268435729*/:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                ViewParent parent = linearLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                    }
                    viewGroup2.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHeaderLayout");
                }
                return createBaseViewHolder(linearLayout3);
            case LOAD_MORE_VIEW /*268436002*/:
                BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
                if (baseLoadMoreModule == null) {
                    Intrinsics.throwNpe();
                }
                VH createBaseViewHolder = createBaseViewHolder(baseLoadMoreModule.getLoadMoreView().getRootView(viewGroup));
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 == null) {
                    Intrinsics.throwNpe();
                }
                baseLoadMoreModule2.setupViewHolder$com_github_CymChad_brvah(createBaseViewHolder);
                return createBaseViewHolder;
            case FOOTER_VIEW /*268436275*/:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                ViewParent parent2 = linearLayout4.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent2;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                    }
                    viewGroup3.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFooterLayout");
                }
                return createBaseViewHolder(linearLayout6);
            case EMPTY_VIEW /*268436821*/:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                ViewParent parent3 = frameLayout.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent3;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                    }
                    viewGroup4.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyLayout");
                }
                return createBaseViewHolder(frameLayout3);
            default:
                VH onCreateDefViewHolder = onCreateDefViewHolder(viewGroup, i);
                bindViewClickListener(onCreateDefViewHolder, i);
                BaseDraggableModule baseDraggableModule = this.mDraggableModule;
                if (baseDraggableModule != null) {
                    baseDraggableModule.initView$com_github_CymChad_brvah(onCreateDefViewHolder);
                }
                onItemViewHolderCreated(onCreateDefViewHolder, i);
                return onCreateDefViewHolder;
        }
    }

    public void onViewAttachedToWindow(@NotNull VH vh) {
        super.onViewAttachedToWindow(vh);
        if (isFixedViewType(vh.getItemViewType())) {
            setFullSpan(vh);
        } else {
            addAnimation(vh);
        }
    }

    public void remove(T t) {
        int indexOf = this.data.indexOf(t);
        if (indexOf != -1) {
            removeAt(indexOf);
        }
    }

    public void onBindViewHolder(@NotNull VH vh, int i) {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(i);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(i);
        }
        switch (vh.getItemViewType()) {
            case HEADER_VIEW /*268435729*/:
            case FOOTER_VIEW /*268436275*/:
            case EMPTY_VIEW /*268436821*/:
                return;
            case LOAD_MORE_VIEW /*268436002*/:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(vh, i, baseLoadMoreModule2.getLoadMoreStatus());
                    return;
                }
                return;
            default:
                convert(vh, getItem(i - getHeaderLayoutCount()));
                return;
        }
    }

    public void addData(@NonNull T t) {
        this.data.add(t);
        notifyItemInserted(this.data.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setDiffNewData(@NotNull @NonNull DiffUtil.DiffResult diffResult, @NotNull List<T> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        diffResult.dispatchUpdatesTo((ListUpdateCallback) new BrvahListUpdateCallback(this));
        this.data = list;
    }

    public void addData(@IntRange(from = 0) int i, @NotNull Collection<? extends T> collection) {
        this.data.addAll(i, collection);
        notifyItemRangeInserted(i + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public void onBindViewHolder(@NotNull VH vh, int i, @NotNull List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(vh, i);
            return;
        }
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(i);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(i);
        }
        switch (vh.getItemViewType()) {
            case HEADER_VIEW /*268435729*/:
            case FOOTER_VIEW /*268436275*/:
            case EMPTY_VIEW /*268436821*/:
                return;
            case LOAD_MORE_VIEW /*268436002*/:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(vh, i, baseLoadMoreModule2.getLoadMoreStatus());
                    return;
                }
                return;
            default:
                convert(vh, getItem(i - getHeaderLayoutCount()), list);
                return;
        }
    }

    public void addData(@NotNull @NonNull Collection<? extends T> collection) {
        this.data.addAll(collection);
        notifyItemRangeInserted((this.data.size() - collection.size()) + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public final void setEmptyView(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(i, recyclerView, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            setEmptyView(inflate);
        }
    }
}
