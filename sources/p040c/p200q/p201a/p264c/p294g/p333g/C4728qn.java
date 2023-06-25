package p040c.p200q.p201a.p264c.p294g.p333g;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zztm;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzae;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.q.a.c.g.g.qn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4728qn {

    /* renamed from: a */
    public static final SparseArray f9589a;

    static {
        SparseArray sparseArray = new SparseArray();
        f9589a = sparseArray;
        sparseArray.put(17000, new Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        f9589a.put(17002, new Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        f9589a.put(17004, new Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        f9589a.put(17008, new Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        f9589a.put(17009, new Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        f9589a.put(17024, new Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        f9589a.put(17014, new Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        f9589a.put(17012, new Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        f9589a.put(17007, new Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        f9589a.put(17025, new Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        f9589a.put(17005, new Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        f9589a.put(17021, new Pair("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        f9589a.put(17011, new Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        f9589a.put(17017, new Pair("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
        f9589a.put(17006, new Pair("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        f9589a.put(17026, new Pair("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        f9589a.put(17029, new Pair("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        f9589a.put(17030, new Pair("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        f9589a.put(17031, new Pair("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        f9589a.put(17033, new Pair("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        f9589a.put(17032, new Pair("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        f9589a.put(17034, new Pair("ERROR_MISSING_EMAIL", "An email address must be provided."));
        f9589a.put(17035, new Pair("ERROR_MISSING_PASSWORD", "A password must be provided."));
        f9589a.put(17041, new Pair("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        f9589a.put(17042, new Pair("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        f9589a.put(17043, new Pair("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        f9589a.put(17044, new Pair("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        f9589a.put(17045, new Pair("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        f9589a.put(17046, new Pair("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        f9589a.put(17049, new Pair("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        f9589a.put(17051, new Pair("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        f9589a.put(17052, new Pair("ERROR_QUOTA_EXCEEDED", "This project's quota for this operation has been exceeded."));
        f9589a.put(17028, new Pair("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console."));
        f9589a.put(17063, new Pair("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services."));
        f9589a.put(17062, new Pair("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        f9589a.put(17064, new Pair("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        f9589a.put(17065, new Pair("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        f9589a.put(17040, new Pair("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        f9589a.put(17068, new Pair("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        f9589a.put(17071, new Pair("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        f9589a.put(17057, new Pair("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        f9589a.put(17058, new Pair("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        f9589a.put(17072, new Pair("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
        f9589a.put(17073, new Pair("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        f9589a.put(17074, new Pair("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        f9589a.put(17075, new Pair("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials"));
        f9589a.put(17077, new Pair("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        f9589a.put(17079, new Pair("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
        f9589a.put(17078, new Pair("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        f9589a.put(17080, new Pair("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
        f9589a.put(17081, new Pair("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in."));
        f9589a.put(17082, new Pair("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided."));
        f9589a.put(17083, new Pair("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in."));
        f9589a.put(17084, new Pair("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided."));
        f9589a.put(17085, new Pair("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only."));
        f9589a.put(17086, new Pair("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email."));
        f9589a.put(17087, new Pair("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account."));
        f9589a.put(17088, new Pair("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded."));
        f9589a.put(17089, new Pair("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."));
        f9589a.put(17090, new Pair("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email."));
        f9589a.put(17091, new Pair("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out."));
        f9589a.put(17093, new Pair("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a valid app identifier, meaning that neither SafetyNet checks nor reCAPTCHA checks succeeded. Please try again, or check the logcat for more details."));
        f9589a.put(17094, new Pair("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."));
        f9589a.put(18001, new Pair("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested."));
        f9589a.put(17095, new Pair("ERROR_UNSUPPORTED_PASSTHROUGH_OPERATION", "This operation is not supported while in passthrough mode."));
        f9589a.put(17096, new Pair("ERROR_TOKEN_REFRESH_UNAVAILABLE", "No refresh token is available."));
        f9589a.put(18002, new Pair("ERROR_MISSING_RECAPTCHA_TOKEN", "The request is missing a ReCAPTCHA token."));
        f9589a.put(18003, new Pair("ERROR_INVALID_RECAPTCHA_TOKEN", "The request contains an invalid ReCAPTCHA token."));
        f9589a.put(18004, new Pair("ERROR_INVALID_RECAPTCHA_ACTION", "The request contains an invalid ReCAPTCHA action."));
        f9589a.put(18006, new Pair("ERROR_RECAPTCHA_NOT_ENABLED", "ReCAPTCHA is not enabled."));
        f9589a.put(18007, new Pair("ERROR_MISSING_CLIENT_TYPE", "The request is missing the ReCAPTCHA client type."));
        f9589a.put(18008, new Pair("ERROR_MISSING_RECAPTCHA_VERSION", "The request is missing the ReCAPTCHA version."));
        f9589a.put(18009, new Pair("ERROR_INVALID_RECAPTCHA_VERSION", "The request contains an invalid ReCAPTCHA version."));
        f9589a.put(18010, new Pair("ERROR_INVALID_REQ_TYPE", "The request is invalid. This can occur if input parameters are missing or malformed."));
        f9589a.put(18011, new Pair("ERROR_CAPTCHA_CHECK_FAILED", "The ReCAPTCHA assessment failed for this request."));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        return new com.google.firebase.FirebaseApiNotAvailableException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        return new com.google.firebase.auth.FirebaseAuthUserCollisionException(m12945d(r0), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        return new com.google.firebase.auth.FirebaseAuthException(m12945d(r0), r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.FirebaseException m12942a(com.google.android.gms.common.api.Status r3) {
        /*
            int r0 = r3.mo24533R()
            java.lang.String r1 = m12947f(r0)
            java.lang.String r1 = m12946e(r1, r3)
            r2 = 17020(0x427c, float:2.385E-41)
            if (r0 == r2) goto L_0x0105
            r2 = 17021(0x427d, float:2.3852E-41)
            if (r0 == r2) goto L_0x00fb
            r2 = 17051(0x429b, float:2.3894E-41)
            if (r0 == r2) goto L_0x00f1
            r2 = 17052(0x429c, float:2.3895E-41)
            if (r0 == r2) goto L_0x00eb
            r2 = 17057(0x42a1, float:2.3902E-41)
            if (r0 == r2) goto L_0x00e1
            r2 = 17058(0x42a2, float:2.3903E-41)
            if (r0 == r2) goto L_0x00e1
            java.lang.String r2 = "An internal error has occurred."
            switch(r0) {
                case 17000: goto L_0x00f1;
                case 17002: goto L_0x00f1;
                case 17004: goto L_0x00f1;
                case 17005: goto L_0x00fb;
                case 17006: goto L_0x00d7;
                case 17007: goto L_0x00cd;
                case 17008: goto L_0x00f1;
                case 17009: goto L_0x00f1;
                case 17010: goto L_0x00c1;
                case 17011: goto L_0x00fb;
                case 17012: goto L_0x00cd;
                case 17049: goto L_0x00f1;
                case 17068: goto L_0x00d7;
                case 17077: goto L_0x00f1;
                case 17079: goto L_0x00d7;
                case 17080: goto L_0x00bb;
                case 17081: goto L_0x00f1;
                case 17082: goto L_0x00f1;
                case 17083: goto L_0x00f1;
                case 17084: goto L_0x00f1;
                case 17085: goto L_0x00d7;
                case 17086: goto L_0x00d7;
                case 17087: goto L_0x00d7;
                case 17088: goto L_0x00d7;
                case 17089: goto L_0x00d7;
                case 17090: goto L_0x00d7;
                case 17091: goto L_0x00d7;
                case 17093: goto L_0x00d7;
                case 17094: goto L_0x00f1;
                case 17095: goto L_0x00d7;
                case 17096: goto L_0x00d7;
                case 17495: goto L_0x00af;
                case 17499: goto L_0x00a5;
                case 18001: goto L_0x00d7;
                case 18002: goto L_0x00d7;
                case 18003: goto L_0x00d7;
                case 18004: goto L_0x00d7;
                case 18006: goto L_0x009b;
                case 18007: goto L_0x00d7;
                case 18008: goto L_0x00d7;
                case 18009: goto L_0x00d7;
                case 18010: goto L_0x00d7;
                case 18011: goto L_0x0091;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r0) {
                case 17014: goto L_0x0087;
                case 17015: goto L_0x007b;
                case 17016: goto L_0x006f;
                case 17017: goto L_0x00fb;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r0) {
                case 17024: goto L_0x00f1;
                case 17025: goto L_0x00cd;
                case 17026: goto L_0x0061;
                default: goto L_0x002f;
            }
        L_0x002f:
            switch(r0) {
                case 17028: goto L_0x00d7;
                case 17029: goto L_0x0057;
                case 17030: goto L_0x0057;
                case 17031: goto L_0x004d;
                case 17032: goto L_0x004d;
                case 17033: goto L_0x004d;
                case 17034: goto L_0x00f1;
                case 17035: goto L_0x00f1;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r0) {
                case 17040: goto L_0x00d7;
                case 17041: goto L_0x00f1;
                case 17042: goto L_0x00f1;
                case 17043: goto L_0x00f1;
                case 17044: goto L_0x00f1;
                case 17045: goto L_0x00f1;
                case 17046: goto L_0x00f1;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r0) {
                case 17061: goto L_0x0041;
                case 17062: goto L_0x00e1;
                case 17063: goto L_0x00bb;
                case 17064: goto L_0x00d7;
                case 17065: goto L_0x00e1;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r0) {
                case 17071: goto L_0x00d7;
                case 17072: goto L_0x00d7;
                case 17073: goto L_0x00d7;
                case 17074: goto L_0x00d7;
                case 17075: goto L_0x00f1;
                default: goto L_0x003b;
            }
        L_0x003b:
            com.google.firebase.FirebaseException r3 = new com.google.firebase.FirebaseException
            r3.<init>(r2)
            return r3
        L_0x0041:
            java.lang.String r0 = "There was a failure in the connection between the web widget and the Firebase Auth backend."
            java.lang.String r3 = m12946e(r0, r3)
            com.google.firebase.FirebaseNetworkException r0 = new com.google.firebase.FirebaseNetworkException
            r0.<init>(r3)
            return r0
        L_0x004d:
            com.google.firebase.auth.FirebaseAuthEmailException r3 = new com.google.firebase.auth.FirebaseAuthEmailException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x0057:
            com.google.firebase.auth.FirebaseAuthActionCodeException r3 = new com.google.firebase.auth.FirebaseAuthActionCodeException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x0061:
            com.google.firebase.auth.FirebaseAuthWeakPasswordException r2 = new com.google.firebase.auth.FirebaseAuthWeakPasswordException
            java.lang.String r0 = m12945d(r0)
            java.lang.String r3 = r3.mo24534S()
            r2.<init>(r0, r1, r3)
            return r2
        L_0x006f:
            java.lang.String r0 = "User was not linked to an account with the given provider."
            java.lang.String r3 = m12946e(r0, r3)
            com.google.firebase.FirebaseException r0 = new com.google.firebase.FirebaseException
            r0.<init>(r3)
            return r0
        L_0x007b:
            java.lang.String r0 = "User has already been linked to the given provider."
            java.lang.String r3 = m12946e(r0, r3)
            com.google.firebase.FirebaseException r0 = new com.google.firebase.FirebaseException
            r0.<init>(r3)
            return r0
        L_0x0087:
            com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException r3 = new com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x0091:
            com.google.firebase.auth.zzv r3 = new com.google.firebase.auth.zzv
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x009b:
            com.google.firebase.auth.zzw r3 = new com.google.firebase.auth.zzw
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x00a5:
            java.lang.String r3 = m12946e(r2, r3)
            com.google.firebase.FirebaseException r0 = new com.google.firebase.FirebaseException
            r0.<init>(r3)
            return r0
        L_0x00af:
            java.lang.String r0 = "Please sign in before trying to get a token."
            java.lang.String r3 = m12946e(r0, r3)
            com.google.firebase.internal.api.FirebaseNoSignedInUserException r0 = new com.google.firebase.internal.api.FirebaseNoSignedInUserException
            r0.<init>(r3)
            return r0
        L_0x00bb:
            com.google.firebase.FirebaseApiNotAvailableException r3 = new com.google.firebase.FirebaseApiNotAvailableException
            r3.<init>(r1)
            return r3
        L_0x00c1:
            java.lang.String r0 = "We have blocked all requests from this device due to unusual activity. Try again later."
            java.lang.String r3 = m12946e(r0, r3)
            com.google.firebase.FirebaseTooManyRequestsException r0 = new com.google.firebase.FirebaseTooManyRequestsException
            r0.<init>(r3)
            return r0
        L_0x00cd:
            com.google.firebase.auth.FirebaseAuthUserCollisionException r3 = new com.google.firebase.auth.FirebaseAuthUserCollisionException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x00d7:
            com.google.firebase.auth.FirebaseAuthException r3 = new com.google.firebase.auth.FirebaseAuthException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x00e1:
            com.google.firebase.auth.FirebaseAuthWebException r3 = new com.google.firebase.auth.FirebaseAuthWebException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x00eb:
            com.google.firebase.FirebaseTooManyRequestsException r3 = new com.google.firebase.FirebaseTooManyRequestsException
            r3.<init>(r1)
            return r3
        L_0x00f1:
            com.google.firebase.auth.FirebaseAuthInvalidCredentialsException r3 = new com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x00fb:
            com.google.firebase.auth.FirebaseAuthInvalidUserException r3 = new com.google.firebase.auth.FirebaseAuthInvalidUserException
            java.lang.String r0 = m12945d(r0)
            r3.<init>(r0, r1)
            return r3
        L_0x0105:
            java.lang.String r0 = "A network error (such as timeout, interrupted connection or unreachable host) has occurred."
            java.lang.String r3 = m12946e(r0, r3)
            com.google.firebase.FirebaseNetworkException r0 = new com.google.firebase.FirebaseNetworkException
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4728qn.m12942a(com.google.android.gms.common.api.Status):com.google.firebase.FirebaseException");
    }

    /* renamed from: b */
    public static FirebaseException m12943b(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        int R = status.mo24533R();
        if (R != 17012 && R != 17007 && R != 17025) {
            return m12942a(status);
        }
        FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = new FirebaseAuthUserCollisionException(m12945d(R), m12946e(m12947f(R), status));
        firebaseAuthUserCollisionException.zza(authCredential);
        firebaseAuthUserCollisionException.zzb(str);
        firebaseAuthUserCollisionException.zzc(str2);
        return firebaseAuthUserCollisionException;
    }

    /* renamed from: c */
    public static FirebaseAuthMultiFactorException m12944c(FirebaseAuth firebaseAuth, zztm zztm, @Nullable FirebaseUser firebaseUser) {
        if (firebaseAuth == null) {
            throw null;
        } else if (zztm != null) {
            Pair pair = (Pair) f9589a.get(17078);
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            Parcelable.Creator<zzae> creator = zzae.CREATOR;
            List<MultiFactorInfo> R = zztm.mo33468R();
            ArrayList arrayList = new ArrayList();
            for (MultiFactorInfo multiFactorInfo : R) {
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                }
            }
            return new FirebaseAuthMultiFactorException(str, str2, new zzae(arrayList, zzag.m22701P(zztm.mo33468R(), zztm.mo33467Q()), firebaseAuth.mo37327b().mo30405n(), zztm.mo33466P(), (zzx) firebaseUser));
        } else {
            throw null;
        }
    }

    /* renamed from: d */
    public static String m12945d(int i) {
        Pair pair = (Pair) f9589a.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    /* renamed from: e */
    public static String m12946e(String str, Status status) {
        if (TextUtils.isEmpty(status.mo24534S())) {
            return str;
        }
        return String.format(String.valueOf(str).concat(" [ %s ]"), new Object[]{status.mo24534S()});
    }

    /* renamed from: f */
    public static String m12947f(int i) {
        Pair pair = (Pair) f9589a.get(i);
        return pair != null ? (String) pair.second : "An internal error has occurred.";
    }
}
