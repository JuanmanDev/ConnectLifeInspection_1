package kotlin.coroutines;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

@SinceKotlin(version = "1.3")
@Target({ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Metadata(mo47990d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo47991d2 = {"Lkotlin/coroutines/RestrictsSuspension;", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
/* compiled from: Continuation.kt */
public @interface RestrictsSuspension {
}
