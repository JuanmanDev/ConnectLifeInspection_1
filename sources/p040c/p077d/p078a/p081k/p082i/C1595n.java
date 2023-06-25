package p040c.p077d.p078a.p081k.p082i;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: c.d.a.k.i.n */
/* compiled from: StreamLocalUriFetcher */
public class C1595n extends C1593l<InputStream> {

    /* renamed from: n */
    public static final UriMatcher f948n;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f948n = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f948n.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f948n.addURI("com.android.contacts", "contacts/#/photo", 2);
        f948n.addURI("com.android.contacts", "contacts/#", 3);
        f948n.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f948n.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C1595n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo15624a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo15625d(InputStream inputStream) {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo15626f(Uri uri, ContentResolver contentResolver) {
        InputStream i = mo15670i(uri, contentResolver);
        if (i != null) {
            return i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream mo15670i(Uri uri, ContentResolver contentResolver) {
        int match = f948n.match(uri);
        if (match != 1) {
            if (match == 3) {
                return mo15671j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return mo15671j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream mo15671j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
