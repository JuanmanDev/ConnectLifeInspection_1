package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p201a.p264c.p276d.p279h.C3434a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C3434a();

    /* renamed from: e */
    public final int f8209e;
    @Nullable

    /* renamed from: l */
    public ParcelFileDescriptor f8210l;

    /* renamed from: m */
    public final int f8211m;
    @Nullable

    /* renamed from: n */
    public Bitmap f8212n = null;

    /* renamed from: o */
    public File f8213o;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f8209e = i;
        this.f8210l = parcelFileDescriptor;
        this.f8211m = i2;
    }

    /* renamed from: P */
    public static final void m10909P(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.f8210l == null) {
            Bitmap bitmap = this.f8212n;
            C3495o.m8908j(bitmap);
            Bitmap bitmap2 = bitmap;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap2.getRowBytes() * bitmap2.getHeight());
            bitmap2.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f8213o;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f8210l = ParcelFileDescriptor.open(createTempFile, SQLiteDatabase.CREATE_IF_NECESSARY);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap2.getWidth());
                            dataOutputStream.writeInt(bitmap2.getHeight());
                            dataOutputStream.writeUTF(bitmap2.getConfig().toString());
                            dataOutputStream.write(array);
                            m10909P(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m10909P(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8209e);
        C3514a.m8968q(parcel, 2, this.f8210l, i | 1, false);
        C3514a.m8963l(parcel, 3, this.f8211m);
        C3514a.m8953b(parcel, a);
        this.f8210l = null;
    }
}
