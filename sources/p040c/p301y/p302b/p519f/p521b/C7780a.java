package p040c.p301y.p302b.p519f.p521b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p031db.SupportSQLiteStatement;
import com.hisense.connect_life.core.global.KeyConst;
import com.juconnect.connectlife.model.ClaimError;
import com.juconnect.connectlife.model.ClaimProduct;
import com.juconnect.connectlife.model.TicketBean;
import com.juconnect.connectlife.sql.inventory.StrListToStrConverter;
import com.juconnect.connectlife.sql.inventory.WineInventoryDao;
import com.juconnect.connectlife.sql.inventory.WineInventoryEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.y.b.f.b.a */
/* compiled from: WineInventoryDao_Impl */
public final class C7780a implements WineInventoryDao {

    /* renamed from: a */
    public final RoomDatabase f14553a;

    /* renamed from: b */
    public final EntityInsertionAdapter<WineInventoryEntity> f14554b;

    /* renamed from: c */
    public final StrListToStrConverter f14555c = new StrListToStrConverter();

    /* renamed from: d */
    public final EntityInsertionAdapter<TicketBean> f14556d;

    /* renamed from: e */
    public final EntityDeletionOrUpdateAdapter<WineInventoryEntity> f14557e;

    /* renamed from: f */
    public final EntityDeletionOrUpdateAdapter<WineInventoryEntity> f14558f;

    /* renamed from: g */
    public final EntityDeletionOrUpdateAdapter<TicketBean> f14559g;

    /* renamed from: h */
    public final SharedSQLiteStatement f14560h;

    /* renamed from: i */
    public final SharedSQLiteStatement f14561i;

    /* renamed from: j */
    public final SharedSQLiteStatement f14562j;

    /* renamed from: c.y.b.f.b.a$a */
    /* compiled from: WineInventoryDao_Impl */
    public class C7781a extends EntityInsertionAdapter<WineInventoryEntity> {
        public C7781a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineInventoryEntity wineInventoryEntity) {
            supportSQLiteStatement.bindLong(1, wineInventoryEntity.getId());
            if (wineInventoryEntity.getIdInventory() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, wineInventoryEntity.getIdInventory());
            }
            if (wineInventoryEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, wineInventoryEntity.getAuid());
            }
            if (wineInventoryEntity.getAgeTo() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wineInventoryEntity.getAgeTo());
            }
            if (wineInventoryEntity.getBestDrinkDate() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, wineInventoryEntity.getBestDrinkDate().longValue());
            }
            if (wineInventoryEntity.getDateAdded() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wineInventoryEntity.getDateAdded());
            }
            if (wineInventoryEntity.getDateRemoved() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wineInventoryEntity.getDateRemoved());
            }
            String fromStrList = C7780a.this.f14555c.fromStrList(wineInventoryEntity.getGrapeType());
            if (fromStrList == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, fromStrList);
            }
            Integer valueOf = wineInventoryEntity.isFavorite() == null ? null : Integer.valueOf(wineInventoryEntity.isFavorite().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, (long) valueOf.intValue());
            }
            if (wineInventoryEntity.getName() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, wineInventoryEntity.getName());
            }
            if (wineInventoryEntity.getPersonalNotes() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, wineInventoryEntity.getPersonalNotes());
            }
            if (wineInventoryEntity.getRegion() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, wineInventoryEntity.getRegion());
            }
            if (wineInventoryEntity.getCountry() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, wineInventoryEntity.getCountry());
            }
            if (wineInventoryEntity.getShelfPosition() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, wineInventoryEntity.getShelfPosition());
            }
            if (wineInventoryEntity.getExactPosition() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, wineInventoryEntity.getExactPosition());
            }
            if (wineInventoryEntity.getVintage() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindLong(16, wineInventoryEntity.getVintage().longValue());
            }
            if (wineInventoryEntity.getVivinoId() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, wineInventoryEntity.getVivinoId());
            }
            if (wineInventoryEntity.getWineType() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, wineInventoryEntity.getWineType());
            }
            if (wineInventoryEntity.getWinery() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, wineInventoryEntity.getWinery());
            }
            if (wineInventoryEntity.getImageUrl() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, wineInventoryEntity.getImageUrl());
            }
            if (wineInventoryEntity.getLastChanged() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, wineInventoryEntity.getLastChanged());
            }
            if (wineInventoryEntity.getCategoryId() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, wineInventoryEntity.getCategoryId());
            }
            supportSQLiteStatement.bindLong(23, wineInventoryEntity.getDateEnterd());
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `wine_inventory` (`id`,`id_inventory`,`auid`,`age_to`,`best_to_drink_date`,`date_added`,`date_removed`,`grape_type`,`favorite`,`name`,`personal_notes`,`region`,`country`,`shelf_position`,`exact_position`,`vintage`,`vivino_id`,`wine_type`,`winery`,`image_url`,`last_changed`,`categoryId`,`dateEnterd`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.y.b.f.b.a$b */
    /* compiled from: WineInventoryDao_Impl */
    public class C7782b extends EntityInsertionAdapter<TicketBean> {
        public C7782b(C7780a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, TicketBean ticketBean) {
            supportSQLiteStatement.bindLong(1, ticketBean.getId());
            if (ticketBean.getClaimId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, (long) ticketBean.getClaimId().intValue());
            }
            if (ticketBean.getDateOfClaim() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, ticketBean.getDateOfClaim());
            }
            if (ticketBean.getDateOfRepair() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, ticketBean.getDateOfRepair());
            }
            if (ticketBean.getSource() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, ticketBean.getSource());
            }
            if (ticketBean.getUserId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, ticketBean.getUserId());
            }
            if (ticketBean.getServiceTechnician() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, ticketBean.getServiceTechnician());
            }
            if (ticketBean.getSagClaimId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, (long) ticketBean.getSagClaimId().intValue());
            }
            if (ticketBean.getServiceOrderId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, (long) ticketBean.getServiceOrderId().intValue());
            }
            if (ticketBean.getService_technician() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, ticketBean.getService_technician());
            }
            if (ticketBean.getStatus() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, ticketBean.getStatus());
            }
            Integer valueOf = ticketBean.getWarranty() == null ? null : Integer.valueOf(ticketBean.getWarranty().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, (long) valueOf.intValue());
            }
            if (ticketBean.getExternalServiceEmail() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, ticketBean.getExternalServiceEmail());
            }
            ClaimProduct product = ticketBean.getProduct();
            if (product != null) {
                if (product.getAuid() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, product.getAuid());
                }
                if (product.getCode() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, product.getCode());
                }
                if (product.getName() == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindString(16, product.getName());
                }
                if (product.getPurchaseDate() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, product.getPurchaseDate());
                }
                if (product.getSerialNumber() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, product.getSerialNumber());
                }
                if (product.getServiceIndex() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindString(19, product.getServiceIndex());
                }
            } else {
                supportSQLiteStatement.bindNull(14);
                supportSQLiteStatement.bindNull(15);
                supportSQLiteStatement.bindNull(16);
                supportSQLiteStatement.bindNull(17);
                supportSQLiteStatement.bindNull(18);
                supportSQLiteStatement.bindNull(19);
            }
            ClaimError error = ticketBean.getError();
            if (error != null) {
                if (error.getTitle() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, error.getTitle());
                }
                if (error.getDescription() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, error.getDescription());
                }
                if (error.getErrorCode() == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, error.getErrorCode());
                }
                if (error.getErrorCodeConnectedAppliances() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, error.getErrorCodeConnectedAppliances());
                }
            } else {
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `ticket_bean` (`id`,`claimId`,`dateOfClaim`,`dateOfRepair`,`source`,`userId`,`serviceTechnician`,`sagClaimId`,`serviceOrderId`,`service_technician`,`status`,`warranty`,`externalServiceEmail`,`auid`,`code`,`name`,`purchaseDate`,`serialNumber`,`serviceIndex`,`title`,`description`,`errorCode`,`errorCodeConnectedAppliances`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: c.y.b.f.b.a$c */
    /* compiled from: WineInventoryDao_Impl */
    public class C7783c extends EntityDeletionOrUpdateAdapter<WineInventoryEntity> {
        public C7783c(C7780a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineInventoryEntity wineInventoryEntity) {
            supportSQLiteStatement.bindLong(1, wineInventoryEntity.getId());
        }

        public String createQuery() {
            return "DELETE FROM `wine_inventory` WHERE `id` = ?";
        }
    }

    /* renamed from: c.y.b.f.b.a$d */
    /* compiled from: WineInventoryDao_Impl */
    public class C7784d extends EntityDeletionOrUpdateAdapter<WineInventoryEntity> {
        public C7784d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WineInventoryEntity wineInventoryEntity) {
            supportSQLiteStatement.bindLong(1, wineInventoryEntity.getId());
            if (wineInventoryEntity.getIdInventory() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, wineInventoryEntity.getIdInventory());
            }
            if (wineInventoryEntity.getAuid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, wineInventoryEntity.getAuid());
            }
            if (wineInventoryEntity.getAgeTo() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, wineInventoryEntity.getAgeTo());
            }
            if (wineInventoryEntity.getBestDrinkDate() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, wineInventoryEntity.getBestDrinkDate().longValue());
            }
            if (wineInventoryEntity.getDateAdded() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, wineInventoryEntity.getDateAdded());
            }
            if (wineInventoryEntity.getDateRemoved() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, wineInventoryEntity.getDateRemoved());
            }
            String fromStrList = C7780a.this.f14555c.fromStrList(wineInventoryEntity.getGrapeType());
            if (fromStrList == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, fromStrList);
            }
            Integer valueOf = wineInventoryEntity.isFavorite() == null ? null : Integer.valueOf(wineInventoryEntity.isFavorite().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, (long) valueOf.intValue());
            }
            if (wineInventoryEntity.getName() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, wineInventoryEntity.getName());
            }
            if (wineInventoryEntity.getPersonalNotes() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, wineInventoryEntity.getPersonalNotes());
            }
            if (wineInventoryEntity.getRegion() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, wineInventoryEntity.getRegion());
            }
            if (wineInventoryEntity.getCountry() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, wineInventoryEntity.getCountry());
            }
            if (wineInventoryEntity.getShelfPosition() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, wineInventoryEntity.getShelfPosition());
            }
            if (wineInventoryEntity.getExactPosition() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, wineInventoryEntity.getExactPosition());
            }
            if (wineInventoryEntity.getVintage() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindLong(16, wineInventoryEntity.getVintage().longValue());
            }
            if (wineInventoryEntity.getVivinoId() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, wineInventoryEntity.getVivinoId());
            }
            if (wineInventoryEntity.getWineType() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, wineInventoryEntity.getWineType());
            }
            if (wineInventoryEntity.getWinery() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, wineInventoryEntity.getWinery());
            }
            if (wineInventoryEntity.getImageUrl() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, wineInventoryEntity.getImageUrl());
            }
            if (wineInventoryEntity.getLastChanged() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, wineInventoryEntity.getLastChanged());
            }
            if (wineInventoryEntity.getCategoryId() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, wineInventoryEntity.getCategoryId());
            }
            supportSQLiteStatement.bindLong(23, wineInventoryEntity.getDateEnterd());
            supportSQLiteStatement.bindLong(24, wineInventoryEntity.getId());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `wine_inventory` SET `id` = ?,`id_inventory` = ?,`auid` = ?,`age_to` = ?,`best_to_drink_date` = ?,`date_added` = ?,`date_removed` = ?,`grape_type` = ?,`favorite` = ?,`name` = ?,`personal_notes` = ?,`region` = ?,`country` = ?,`shelf_position` = ?,`exact_position` = ?,`vintage` = ?,`vivino_id` = ?,`wine_type` = ?,`winery` = ?,`image_url` = ?,`last_changed` = ?,`categoryId` = ?,`dateEnterd` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: c.y.b.f.b.a$e */
    /* compiled from: WineInventoryDao_Impl */
    public class C7785e extends EntityDeletionOrUpdateAdapter<TicketBean> {
        public C7785e(C7780a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, TicketBean ticketBean) {
            supportSQLiteStatement.bindLong(1, ticketBean.getId());
            if (ticketBean.getClaimId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, (long) ticketBean.getClaimId().intValue());
            }
            if (ticketBean.getDateOfClaim() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, ticketBean.getDateOfClaim());
            }
            if (ticketBean.getDateOfRepair() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, ticketBean.getDateOfRepair());
            }
            if (ticketBean.getSource() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, ticketBean.getSource());
            }
            if (ticketBean.getUserId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, ticketBean.getUserId());
            }
            if (ticketBean.getServiceTechnician() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, ticketBean.getServiceTechnician());
            }
            if (ticketBean.getSagClaimId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, (long) ticketBean.getSagClaimId().intValue());
            }
            if (ticketBean.getServiceOrderId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, (long) ticketBean.getServiceOrderId().intValue());
            }
            if (ticketBean.getService_technician() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, ticketBean.getService_technician());
            }
            if (ticketBean.getStatus() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, ticketBean.getStatus());
            }
            Integer valueOf = ticketBean.getWarranty() == null ? null : Integer.valueOf(ticketBean.getWarranty().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, (long) valueOf.intValue());
            }
            if (ticketBean.getExternalServiceEmail() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, ticketBean.getExternalServiceEmail());
            }
            ClaimProduct product = ticketBean.getProduct();
            if (product != null) {
                if (product.getAuid() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, product.getAuid());
                }
                if (product.getCode() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, product.getCode());
                }
                if (product.getName() == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindString(16, product.getName());
                }
                if (product.getPurchaseDate() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, product.getPurchaseDate());
                }
                if (product.getSerialNumber() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, product.getSerialNumber());
                }
                if (product.getServiceIndex() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindString(19, product.getServiceIndex());
                }
            } else {
                supportSQLiteStatement.bindNull(14);
                supportSQLiteStatement.bindNull(15);
                supportSQLiteStatement.bindNull(16);
                supportSQLiteStatement.bindNull(17);
                supportSQLiteStatement.bindNull(18);
                supportSQLiteStatement.bindNull(19);
            }
            ClaimError error = ticketBean.getError();
            if (error != null) {
                if (error.getTitle() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, error.getTitle());
                }
                if (error.getDescription() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, error.getDescription());
                }
                if (error.getErrorCode() == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, error.getErrorCode());
                }
                if (error.getErrorCodeConnectedAppliances() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, error.getErrorCodeConnectedAppliances());
                }
            } else {
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
            }
            supportSQLiteStatement.bindLong(24, ticketBean.getId());
        }

        public String createQuery() {
            return "UPDATE OR ABORT `ticket_bean` SET `id` = ?,`claimId` = ?,`dateOfClaim` = ?,`dateOfRepair` = ?,`source` = ?,`userId` = ?,`serviceTechnician` = ?,`sagClaimId` = ?,`serviceOrderId` = ?,`service_technician` = ?,`status` = ?,`warranty` = ?,`externalServiceEmail` = ?,`auid` = ?,`code` = ?,`name` = ?,`purchaseDate` = ?,`serialNumber` = ?,`serviceIndex` = ?,`title` = ?,`description` = ?,`errorCode` = ?,`errorCodeConnectedAppliances` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: c.y.b.f.b.a$f */
    /* compiled from: WineInventoryDao_Impl */
    public class C7786f extends SharedSQLiteStatement {
        public C7786f(C7780a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM wine_inventory";
        }
    }

    /* renamed from: c.y.b.f.b.a$g */
    /* compiled from: WineInventoryDao_Impl */
    public class C7787g extends SharedSQLiteStatement {
        public C7787g(C7780a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "UPDATE wine_inventory SET date_removed = ?  WHERE id_inventory = ?";
        }
    }

    /* renamed from: c.y.b.f.b.a$h */
    /* compiled from: WineInventoryDao_Impl */
    public class C7788h extends SharedSQLiteStatement {
        public C7788h(C7780a aVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM ticket_bean";
        }
    }

    public C7780a(RoomDatabase roomDatabase) {
        this.f14553a = roomDatabase;
        this.f14554b = new C7781a(roomDatabase);
        this.f14556d = new C7782b(this, roomDatabase);
        this.f14557e = new C7783c(this, roomDatabase);
        this.f14558f = new C7784d(roomDatabase);
        this.f14559g = new C7785e(this, roomDatabase);
        this.f14560h = new C7786f(this, roomDatabase);
        this.f14561i = new C7787g(this, roomDatabase);
        this.f14562j = new C7788h(this, roomDatabase);
    }

    /* renamed from: b */
    public static List<Class<?>> m21832b() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.f14553a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14560h.acquire();
        this.f14553a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
            this.f14560h.release(acquire);
        }
    }

    public void deleteTicketModel() {
        this.f14553a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14562j.acquire();
        this.f14553a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
            this.f14562j.release(acquire);
        }
    }

    public int deleteWineInventories(List<WineInventoryEntity> list) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            int handleMultiple = this.f14557e.handleMultiple(list) + 0;
            this.f14553a.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public int deleteWineInventory(WineInventoryEntity wineInventoryEntity) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            int handle = this.f14557e.handle(wineInventoryEntity) + 0;
            this.f14553a.setTransactionSuccessful();
            return handle;
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public void insertTickModel(TicketBean ticketBean) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            this.f14556d.insert(ticketBean);
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public void insertTickModelList(List<TicketBean> list) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            this.f14556d.insert(list);
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public void insertWineInventories(List<WineInventoryEntity> list) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            this.f14554b.insert(list);
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public void insertWineInventory(WineInventoryEntity wineInventoryEntity) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            this.f14554b.insert(wineInventoryEntity);
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public List<WineInventoryEntity> loadAllByAuid(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        String str2;
        String str3;
        String str4;
        Long l;
        String str5;
        String str6;
        int i;
        String str7;
        Integer num;
        Boolean bool;
        String str8;
        String str9;
        String str10;
        int i2;
        String str11;
        int i3;
        String str12;
        int i4;
        String str13;
        int i5;
        Long l2;
        int i6;
        String str14;
        int i7;
        String str15;
        int i8;
        String str16;
        int i9;
        String str17;
        int i10;
        String str18;
        int i11;
        String str19;
        int i12;
        String str20 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory WHERE auid = ?", 1);
        if (str20 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str20);
        }
        this.f14553a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14553a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id_inventory");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_AUIT);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "age_to");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "best_to_drink_date");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date_added");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date_removed");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "grape_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "personal_notes");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "region");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "country");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "shelf_position");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "exact_position");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "vintage");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "wine_type");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "winery");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "image_url");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "last_changed");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "dateEnterd");
                int i13 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow5));
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        i = columnIndexOrThrow;
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow8);
                        i = columnIndexOrThrow;
                    }
                    List<String> strList = this.f14555c.toStrList(str7);
                    if (query.isNull(columnIndexOrThrow9)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow9));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(num.intValue() != 0);
                    }
                    if (query.isNull(columnIndexOrThrow10)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        str9 = null;
                    } else {
                        str9 = query.getString(columnIndexOrThrow11);
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        i2 = i13;
                        str10 = null;
                    } else {
                        str10 = query.getString(columnIndexOrThrow12);
                        i2 = i13;
                    }
                    if (query.isNull(i2)) {
                        i3 = columnIndexOrThrow14;
                        str11 = null;
                    } else {
                        str11 = query.getString(i2);
                        i3 = columnIndexOrThrow14;
                    }
                    if (query.isNull(i3)) {
                        i13 = i2;
                        i4 = columnIndexOrThrow15;
                        str12 = null;
                    } else {
                        i13 = i2;
                        str12 = query.getString(i3);
                        i4 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i4)) {
                        columnIndexOrThrow15 = i4;
                        i5 = columnIndexOrThrow16;
                        str13 = null;
                    } else {
                        columnIndexOrThrow15 = i4;
                        str13 = query.getString(i4);
                        i5 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i5)) {
                        columnIndexOrThrow16 = i5;
                        i6 = columnIndexOrThrow17;
                        l2 = null;
                    } else {
                        columnIndexOrThrow16 = i5;
                        l2 = Long.valueOf(query.getLong(i5));
                        i6 = columnIndexOrThrow17;
                    }
                    if (query.isNull(i6)) {
                        columnIndexOrThrow17 = i6;
                        i7 = columnIndexOrThrow18;
                        str14 = null;
                    } else {
                        columnIndexOrThrow17 = i6;
                        str14 = query.getString(i6);
                        i7 = columnIndexOrThrow18;
                    }
                    if (query.isNull(i7)) {
                        columnIndexOrThrow18 = i7;
                        i8 = columnIndexOrThrow19;
                        str15 = null;
                    } else {
                        columnIndexOrThrow18 = i7;
                        str15 = query.getString(i7);
                        i8 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i8)) {
                        columnIndexOrThrow19 = i8;
                        i9 = columnIndexOrThrow20;
                        str16 = null;
                    } else {
                        columnIndexOrThrow19 = i8;
                        str16 = query.getString(i8);
                        i9 = columnIndexOrThrow20;
                    }
                    if (query.isNull(i9)) {
                        columnIndexOrThrow20 = i9;
                        i10 = columnIndexOrThrow21;
                        str17 = null;
                    } else {
                        columnIndexOrThrow20 = i9;
                        str17 = query.getString(i9);
                        i10 = columnIndexOrThrow21;
                    }
                    if (query.isNull(i10)) {
                        columnIndexOrThrow21 = i10;
                        i11 = columnIndexOrThrow22;
                        str18 = null;
                    } else {
                        columnIndexOrThrow21 = i10;
                        str18 = query.getString(i10);
                        i11 = columnIndexOrThrow22;
                    }
                    if (query.isNull(i11)) {
                        columnIndexOrThrow22 = i11;
                        i12 = columnIndexOrThrow23;
                        str19 = null;
                    } else {
                        columnIndexOrThrow22 = i11;
                        str19 = query.getString(i11);
                        i12 = columnIndexOrThrow23;
                    }
                    columnIndexOrThrow23 = i12;
                    arrayList.add(new WineInventoryEntity(j, str2, str3, str4, l, str5, str6, strList, bool, str8, str9, str10, str11, str12, str13, l2, str14, str15, str16, str17, str18, str19, query.getLong(i12)));
                    columnIndexOrThrow14 = i3;
                    columnIndexOrThrow = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0238 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023b A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0247 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024a A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0263 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0290 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a2 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a6 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b4 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02b8 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c6 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02ca A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d8 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02de A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01fc A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ff A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020e A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021a A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0229 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022c A[Catch:{ all -> 0x0320 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.juconnect.connectlife.model.TicketBean> loadAllTicketModel() {
        /*
            r50 = this;
            r1 = r50
            java.lang.String r0 = "SELECT * FROM ticket_bean"
            r2 = 0
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            androidx.room.RoomDatabase r0 = r1.f14553a
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.f14553a
            r4 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r0, r3, r2, r4)
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r0)     // Catch:{ all -> 0x0322 }
            java.lang.String r6 = "claimId"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r6)     // Catch:{ all -> 0x0322 }
            java.lang.String r7 = "dateOfClaim"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r7)     // Catch:{ all -> 0x0322 }
            java.lang.String r8 = "dateOfRepair"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r8)     // Catch:{ all -> 0x0322 }
            java.lang.String r9 = "source"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r9)     // Catch:{ all -> 0x0322 }
            java.lang.String r10 = "userId"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r10)     // Catch:{ all -> 0x0322 }
            java.lang.String r11 = "serviceTechnician"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r11)     // Catch:{ all -> 0x0322 }
            java.lang.String r12 = "sagClaimId"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r12)     // Catch:{ all -> 0x0322 }
            java.lang.String r13 = "serviceOrderId"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r13)     // Catch:{ all -> 0x0322 }
            java.lang.String r14 = "service_technician"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r14)     // Catch:{ all -> 0x0322 }
            java.lang.String r15 = "status"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r15)     // Catch:{ all -> 0x0322 }
            java.lang.String r2 = "warranty"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r2)     // Catch:{ all -> 0x0322 }
            java.lang.String r4 = "externalServiceEmail"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r4)     // Catch:{ all -> 0x0322 }
            java.lang.String r1 = "auid"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r1)     // Catch:{ all -> 0x0322 }
            r16 = r3
            java.lang.String r3 = "code"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r17 = r3
            java.lang.String r3 = "name"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r18 = r3
            java.lang.String r3 = "purchaseDate"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r19 = r3
            java.lang.String r3 = "serialNumber"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r20 = r3
            java.lang.String r3 = "serviceIndex"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r21 = r3
            java.lang.String r3 = "title"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r22 = r3
            java.lang.String r3 = "description"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r23 = r3
            java.lang.String r3 = "errorCode"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r24 = r3
            java.lang.String r3 = "errorCodeConnectedAppliances"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch:{ all -> 0x0320 }
            r25 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0320 }
            r26 = r1
            int r1 = r5.getCount()     // Catch:{ all -> 0x0320 }
            r3.<init>(r1)     // Catch:{ all -> 0x0320 }
        L_0x00be:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0319
            long r29 = r5.getLong(r0)     // Catch:{ all -> 0x0320 }
            boolean r1 = r5.isNull(r6)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x00d1
            r31 = 0
            goto L_0x00db
        L_0x00d1:
            int r1 = r5.getInt(r6)     // Catch:{ all -> 0x0320 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0320 }
            r31 = r1
        L_0x00db:
            boolean r1 = r5.isNull(r7)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x00e4
            r32 = 0
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r1 = r5.getString(r7)     // Catch:{ all -> 0x0320 }
            r32 = r1
        L_0x00ea:
            boolean r1 = r5.isNull(r8)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x00f3
            r33 = 0
            goto L_0x00f9
        L_0x00f3:
            java.lang.String r1 = r5.getString(r8)     // Catch:{ all -> 0x0320 }
            r33 = r1
        L_0x00f9:
            boolean r1 = r5.isNull(r9)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0102
            r34 = 0
            goto L_0x0108
        L_0x0102:
            java.lang.String r1 = r5.getString(r9)     // Catch:{ all -> 0x0320 }
            r34 = r1
        L_0x0108:
            boolean r1 = r5.isNull(r10)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0111
            r35 = 0
            goto L_0x0117
        L_0x0111:
            java.lang.String r1 = r5.getString(r10)     // Catch:{ all -> 0x0320 }
            r35 = r1
        L_0x0117:
            boolean r1 = r5.isNull(r11)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0120
            r36 = 0
            goto L_0x0126
        L_0x0120:
            java.lang.String r1 = r5.getString(r11)     // Catch:{ all -> 0x0320 }
            r36 = r1
        L_0x0126:
            boolean r1 = r5.isNull(r12)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x012f
            r37 = 0
            goto L_0x0139
        L_0x012f:
            int r1 = r5.getInt(r12)     // Catch:{ all -> 0x0320 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0320 }
            r37 = r1
        L_0x0139:
            boolean r1 = r5.isNull(r13)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0142
            r38 = 0
            goto L_0x014c
        L_0x0142:
            int r1 = r5.getInt(r13)     // Catch:{ all -> 0x0320 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0320 }
            r38 = r1
        L_0x014c:
            boolean r1 = r5.isNull(r14)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0155
            r39 = 0
            goto L_0x015b
        L_0x0155:
            java.lang.String r1 = r5.getString(r14)     // Catch:{ all -> 0x0320 }
            r39 = r1
        L_0x015b:
            boolean r1 = r5.isNull(r15)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0164
            r40 = 0
            goto L_0x016a
        L_0x0164:
            java.lang.String r1 = r5.getString(r15)     // Catch:{ all -> 0x0320 }
            r40 = r1
        L_0x016a:
            boolean r1 = r5.isNull(r2)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0172
            r1 = 0
            goto L_0x017a
        L_0x0172:
            int r1 = r5.getInt(r2)     // Catch:{ all -> 0x0320 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0320 }
        L_0x017a:
            if (r1 != 0) goto L_0x017f
            r41 = 0
            goto L_0x018e
        L_0x017f:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0187
            r1 = 1
            goto L_0x0188
        L_0x0187:
            r1 = 0
        L_0x0188:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0320 }
            r41 = r1
        L_0x018e:
            boolean r1 = r5.isNull(r4)     // Catch:{ all -> 0x0320 }
            if (r1 == 0) goto L_0x0199
            r1 = r26
            r42 = 0
            goto L_0x01a1
        L_0x0199:
            java.lang.String r1 = r5.getString(r4)     // Catch:{ all -> 0x0320 }
            r42 = r1
            r1 = r26
        L_0x01a1:
            boolean r26 = r5.isNull(r1)     // Catch:{ all -> 0x0320 }
            if (r26 == 0) goto L_0x01e2
            r26 = r0
            r0 = r17
            boolean r17 = r5.isNull(r0)     // Catch:{ all -> 0x0320 }
            if (r17 == 0) goto L_0x01e6
            r17 = r2
            r2 = r18
            boolean r18 = r5.isNull(r2)     // Catch:{ all -> 0x0320 }
            if (r18 == 0) goto L_0x01ea
            r18 = r4
            r4 = r19
            boolean r19 = r5.isNull(r4)     // Catch:{ all -> 0x0320 }
            if (r19 == 0) goto L_0x01ee
            r19 = r6
            r6 = r20
            boolean r20 = r5.isNull(r6)     // Catch:{ all -> 0x0320 }
            if (r20 == 0) goto L_0x01f2
            r20 = r7
            r7 = r21
            boolean r21 = r5.isNull(r7)     // Catch:{ all -> 0x0320 }
            if (r21 != 0) goto L_0x01da
            goto L_0x01f6
        L_0x01da:
            r21 = r0
            r0 = r22
            r28 = 0
            goto L_0x025d
        L_0x01e2:
            r26 = r0
            r0 = r17
        L_0x01e6:
            r17 = r2
            r2 = r18
        L_0x01ea:
            r18 = r4
            r4 = r19
        L_0x01ee:
            r19 = r6
            r6 = r20
        L_0x01f2:
            r20 = r7
            r7 = r21
        L_0x01f6:
            boolean r21 = r5.isNull(r1)     // Catch:{ all -> 0x0320 }
            if (r21 == 0) goto L_0x01ff
            r44 = 0
            goto L_0x0205
        L_0x01ff:
            java.lang.String r21 = r5.getString(r1)     // Catch:{ all -> 0x0320 }
            r44 = r21
        L_0x0205:
            boolean r21 = r5.isNull(r0)     // Catch:{ all -> 0x0320 }
            if (r21 == 0) goto L_0x020e
            r45 = 0
            goto L_0x0214
        L_0x020e:
            java.lang.String r21 = r5.getString(r0)     // Catch:{ all -> 0x0320 }
            r45 = r21
        L_0x0214:
            boolean r21 = r5.isNull(r2)     // Catch:{ all -> 0x0320 }
            if (r21 == 0) goto L_0x021d
            r46 = 0
            goto L_0x0223
        L_0x021d:
            java.lang.String r21 = r5.getString(r2)     // Catch:{ all -> 0x0320 }
            r46 = r21
        L_0x0223:
            boolean r21 = r5.isNull(r4)     // Catch:{ all -> 0x0320 }
            if (r21 == 0) goto L_0x022c
            r47 = 0
            goto L_0x0232
        L_0x022c:
            java.lang.String r21 = r5.getString(r4)     // Catch:{ all -> 0x0320 }
            r47 = r21
        L_0x0232:
            boolean r21 = r5.isNull(r6)     // Catch:{ all -> 0x0320 }
            if (r21 == 0) goto L_0x023b
            r48 = 0
            goto L_0x0241
        L_0x023b:
            java.lang.String r21 = r5.getString(r6)     // Catch:{ all -> 0x0320 }
            r48 = r21
        L_0x0241:
            boolean r21 = r5.isNull(r7)     // Catch:{ all -> 0x0320 }
            if (r21 == 0) goto L_0x024a
            r49 = 0
            goto L_0x0250
        L_0x024a:
            java.lang.String r21 = r5.getString(r7)     // Catch:{ all -> 0x0320 }
            r49 = r21
        L_0x0250:
            com.juconnect.connectlife.model.ClaimProduct r21 = new com.juconnect.connectlife.model.ClaimProduct     // Catch:{ all -> 0x0320 }
            r43 = r21
            r43.<init>(r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x0320 }
            r28 = r21
            r21 = r0
            r0 = r22
        L_0x025d:
            boolean r22 = r5.isNull(r0)     // Catch:{ all -> 0x0320 }
            if (r22 == 0) goto L_0x0290
            r22 = r1
            r1 = r23
            boolean r23 = r5.isNull(r1)     // Catch:{ all -> 0x0320 }
            if (r23 == 0) goto L_0x0294
            r23 = r2
            r2 = r24
            boolean r24 = r5.isNull(r2)     // Catch:{ all -> 0x0320 }
            if (r24 == 0) goto L_0x0298
            r24 = r4
            r4 = r25
            boolean r25 = r5.isNull(r4)     // Catch:{ all -> 0x0320 }
            if (r25 != 0) goto L_0x0282
            goto L_0x029c
        L_0x0282:
            r44 = r0
            r45 = r1
            r46 = r2
            r47 = r4
            r25 = r6
            r43 = 0
            goto L_0x02ef
        L_0x0290:
            r22 = r1
            r1 = r23
        L_0x0294:
            r23 = r2
            r2 = r24
        L_0x0298:
            r24 = r4
            r4 = r25
        L_0x029c:
            boolean r25 = r5.isNull(r0)     // Catch:{ all -> 0x0320 }
            if (r25 == 0) goto L_0x02a6
            r44 = r0
            r0 = 0
            goto L_0x02ae
        L_0x02a6:
            java.lang.String r25 = r5.getString(r0)     // Catch:{ all -> 0x0320 }
            r44 = r0
            r0 = r25
        L_0x02ae:
            boolean r25 = r5.isNull(r1)     // Catch:{ all -> 0x0320 }
            if (r25 == 0) goto L_0x02b8
            r45 = r1
            r1 = 0
            goto L_0x02c0
        L_0x02b8:
            java.lang.String r25 = r5.getString(r1)     // Catch:{ all -> 0x0320 }
            r45 = r1
            r1 = r25
        L_0x02c0:
            boolean r25 = r5.isNull(r2)     // Catch:{ all -> 0x0320 }
            if (r25 == 0) goto L_0x02ca
            r46 = r2
            r2 = 0
            goto L_0x02d2
        L_0x02ca:
            java.lang.String r25 = r5.getString(r2)     // Catch:{ all -> 0x0320 }
            r46 = r2
            r2 = r25
        L_0x02d2:
            boolean r25 = r5.isNull(r4)     // Catch:{ all -> 0x0320 }
            if (r25 == 0) goto L_0x02de
            r47 = r4
            r25 = r6
            r4 = 0
            goto L_0x02e8
        L_0x02de:
            java.lang.String r25 = r5.getString(r4)     // Catch:{ all -> 0x0320 }
            r47 = r4
            r4 = r25
            r25 = r6
        L_0x02e8:
            com.juconnect.connectlife.model.ClaimError r6 = new com.juconnect.connectlife.model.ClaimError     // Catch:{ all -> 0x0320 }
            r6.<init>(r0, r1, r2, r4)     // Catch:{ all -> 0x0320 }
            r43 = r6
        L_0x02ef:
            com.juconnect.connectlife.model.TicketBean r0 = new com.juconnect.connectlife.model.TicketBean     // Catch:{ all -> 0x0320 }
            r27 = r0
            r27.<init>(r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0320 }
            r3.add(r0)     // Catch:{ all -> 0x0320 }
            r2 = r17
            r4 = r18
            r6 = r19
            r17 = r21
            r18 = r23
            r19 = r24
            r0 = r26
            r23 = r45
            r24 = r46
            r21 = r7
            r7 = r20
            r26 = r22
            r20 = r25
            r22 = r44
            r25 = r47
            goto L_0x00be
        L_0x0319:
            r5.close()
            r16.release()
            return r3
        L_0x0320:
            r0 = move-exception
            goto L_0x0325
        L_0x0322:
            r0 = move-exception
            r16 = r3
        L_0x0325:
            r5.close()
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p301y.p302b.p519f.p521b.C7780a.loadAllTicketModel():java.util.List");
    }

    public List<WineInventoryEntity> loadAllVivinoId(long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        int i;
        String str6;
        Integer num;
        Boolean bool;
        String str7;
        String str8;
        String str9;
        int i2;
        String str10;
        int i3;
        String str11;
        int i4;
        String str12;
        int i5;
        Long l2;
        int i6;
        String str13;
        int i7;
        String str14;
        int i8;
        String str15;
        int i9;
        String str16;
        int i10;
        String str17;
        int i11;
        String str18;
        int i12;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory WHERE vivino_id = ?", 1);
        acquire.bindLong(1, j);
        this.f14553a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14553a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id_inventory");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_AUIT);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "age_to");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "best_to_drink_date");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date_added");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date_removed");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "grape_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "personal_notes");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "region");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "country");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "shelf_position");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "exact_position");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "vintage");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "wine_type");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "winery");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "image_url");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "last_changed");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "dateEnterd");
                int i13 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j2 = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow5));
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        i = columnIndexOrThrow;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow8);
                        i = columnIndexOrThrow;
                    }
                    List<String> strList = this.f14555c.toStrList(str6);
                    if (query.isNull(columnIndexOrThrow9)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow9));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(num.intValue() != 0);
                    }
                    if (query.isNull(columnIndexOrThrow10)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow11);
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        i2 = i13;
                        str9 = null;
                    } else {
                        str9 = query.getString(columnIndexOrThrow12);
                        i2 = i13;
                    }
                    if (query.isNull(i2)) {
                        i3 = columnIndexOrThrow14;
                        str10 = null;
                    } else {
                        str10 = query.getString(i2);
                        i3 = columnIndexOrThrow14;
                    }
                    if (query.isNull(i3)) {
                        i13 = i2;
                        i4 = columnIndexOrThrow15;
                        str11 = null;
                    } else {
                        i13 = i2;
                        str11 = query.getString(i3);
                        i4 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i4)) {
                        columnIndexOrThrow15 = i4;
                        i5 = columnIndexOrThrow16;
                        str12 = null;
                    } else {
                        columnIndexOrThrow15 = i4;
                        str12 = query.getString(i4);
                        i5 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i5)) {
                        columnIndexOrThrow16 = i5;
                        i6 = columnIndexOrThrow17;
                        l2 = null;
                    } else {
                        columnIndexOrThrow16 = i5;
                        l2 = Long.valueOf(query.getLong(i5));
                        i6 = columnIndexOrThrow17;
                    }
                    if (query.isNull(i6)) {
                        columnIndexOrThrow17 = i6;
                        i7 = columnIndexOrThrow18;
                        str13 = null;
                    } else {
                        columnIndexOrThrow17 = i6;
                        str13 = query.getString(i6);
                        i7 = columnIndexOrThrow18;
                    }
                    if (query.isNull(i7)) {
                        columnIndexOrThrow18 = i7;
                        i8 = columnIndexOrThrow19;
                        str14 = null;
                    } else {
                        columnIndexOrThrow18 = i7;
                        str14 = query.getString(i7);
                        i8 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i8)) {
                        columnIndexOrThrow19 = i8;
                        i9 = columnIndexOrThrow20;
                        str15 = null;
                    } else {
                        columnIndexOrThrow19 = i8;
                        str15 = query.getString(i8);
                        i9 = columnIndexOrThrow20;
                    }
                    if (query.isNull(i9)) {
                        columnIndexOrThrow20 = i9;
                        i10 = columnIndexOrThrow21;
                        str16 = null;
                    } else {
                        columnIndexOrThrow20 = i9;
                        str16 = query.getString(i9);
                        i10 = columnIndexOrThrow21;
                    }
                    if (query.isNull(i10)) {
                        columnIndexOrThrow21 = i10;
                        i11 = columnIndexOrThrow22;
                        str17 = null;
                    } else {
                        columnIndexOrThrow21 = i10;
                        str17 = query.getString(i10);
                        i11 = columnIndexOrThrow22;
                    }
                    if (query.isNull(i11)) {
                        columnIndexOrThrow22 = i11;
                        i12 = columnIndexOrThrow23;
                        str18 = null;
                    } else {
                        columnIndexOrThrow22 = i11;
                        str18 = query.getString(i11);
                        i12 = columnIndexOrThrow23;
                    }
                    columnIndexOrThrow23 = i12;
                    arrayList.add(new WineInventoryEntity(j2, str, str2, str3, l, str4, str5, strList, bool, str7, str8, str9, str10, str11, str12, l2, str13, str14, str15, str16, str17, str18, query.getLong(i12)));
                    columnIndexOrThrow14 = i3;
                    columnIndexOrThrow = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WineInventoryEntity> loadAllWineInventories() {
        RoomSQLiteQuery roomSQLiteQuery;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        int i;
        String str6;
        Integer num;
        Boolean bool;
        String str7;
        String str8;
        String str9;
        int i2;
        String str10;
        int i3;
        String str11;
        int i4;
        String str12;
        int i5;
        Long l2;
        int i6;
        String str13;
        int i7;
        String str14;
        int i8;
        String str15;
        int i9;
        String str16;
        int i10;
        String str17;
        int i11;
        String str18;
        int i12;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory", 0);
        this.f14553a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14553a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id_inventory");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_AUIT);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "age_to");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "best_to_drink_date");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date_added");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date_removed");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "grape_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "personal_notes");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "region");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "country");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "shelf_position");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "exact_position");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "vintage");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "wine_type");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "winery");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "image_url");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "last_changed");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "dateEnterd");
                int i13 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow5));
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        i = columnIndexOrThrow;
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow8);
                        i = columnIndexOrThrow;
                    }
                    List<String> strList = this.f14555c.toStrList(str6);
                    if (query.isNull(columnIndexOrThrow9)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow9));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(num.intValue() != 0);
                    }
                    if (query.isNull(columnIndexOrThrow10)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow11);
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        i2 = i13;
                        str9 = null;
                    } else {
                        str9 = query.getString(columnIndexOrThrow12);
                        i2 = i13;
                    }
                    if (query.isNull(i2)) {
                        i3 = columnIndexOrThrow14;
                        str10 = null;
                    } else {
                        str10 = query.getString(i2);
                        i3 = columnIndexOrThrow14;
                    }
                    if (query.isNull(i3)) {
                        i13 = i2;
                        i4 = columnIndexOrThrow15;
                        str11 = null;
                    } else {
                        i13 = i2;
                        str11 = query.getString(i3);
                        i4 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i4)) {
                        columnIndexOrThrow15 = i4;
                        i5 = columnIndexOrThrow16;
                        str12 = null;
                    } else {
                        columnIndexOrThrow15 = i4;
                        str12 = query.getString(i4);
                        i5 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i5)) {
                        columnIndexOrThrow16 = i5;
                        i6 = columnIndexOrThrow17;
                        l2 = null;
                    } else {
                        columnIndexOrThrow16 = i5;
                        l2 = Long.valueOf(query.getLong(i5));
                        i6 = columnIndexOrThrow17;
                    }
                    if (query.isNull(i6)) {
                        columnIndexOrThrow17 = i6;
                        i7 = columnIndexOrThrow18;
                        str13 = null;
                    } else {
                        columnIndexOrThrow17 = i6;
                        str13 = query.getString(i6);
                        i7 = columnIndexOrThrow18;
                    }
                    if (query.isNull(i7)) {
                        columnIndexOrThrow18 = i7;
                        i8 = columnIndexOrThrow19;
                        str14 = null;
                    } else {
                        columnIndexOrThrow18 = i7;
                        str14 = query.getString(i7);
                        i8 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i8)) {
                        columnIndexOrThrow19 = i8;
                        i9 = columnIndexOrThrow20;
                        str15 = null;
                    } else {
                        columnIndexOrThrow19 = i8;
                        str15 = query.getString(i8);
                        i9 = columnIndexOrThrow20;
                    }
                    if (query.isNull(i9)) {
                        columnIndexOrThrow20 = i9;
                        i10 = columnIndexOrThrow21;
                        str16 = null;
                    } else {
                        columnIndexOrThrow20 = i9;
                        str16 = query.getString(i9);
                        i10 = columnIndexOrThrow21;
                    }
                    if (query.isNull(i10)) {
                        columnIndexOrThrow21 = i10;
                        i11 = columnIndexOrThrow22;
                        str17 = null;
                    } else {
                        columnIndexOrThrow21 = i10;
                        str17 = query.getString(i10);
                        i11 = columnIndexOrThrow22;
                    }
                    if (query.isNull(i11)) {
                        columnIndexOrThrow22 = i11;
                        i12 = columnIndexOrThrow23;
                        str18 = null;
                    } else {
                        columnIndexOrThrow22 = i11;
                        str18 = query.getString(i11);
                        i12 = columnIndexOrThrow23;
                    }
                    columnIndexOrThrow23 = i12;
                    arrayList.add(new WineInventoryEntity(j, str, str2, str3, l, str4, str5, strList, bool, str7, str8, str9, str10, str11, str12, l2, str13, str14, str15, str16, str17, str18, query.getLong(i12)));
                    columnIndexOrThrow14 = i3;
                    columnIndexOrThrow = i;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public WineInventoryEntity loadAllWineInventory(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WineInventoryEntity wineInventoryEntity;
        String str2;
        String str3;
        String str4;
        Long l;
        String str5;
        String str6;
        String str7;
        Integer num;
        Boolean bool;
        String str8;
        String str9;
        String str10;
        String str11;
        int i;
        String str12;
        int i2;
        String str13;
        int i3;
        Long l2;
        int i4;
        String str14;
        int i5;
        String str15;
        int i6;
        String str16;
        int i7;
        String str17;
        int i8;
        String str18;
        int i9;
        String str19;
        String str20 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM wine_inventory WHERE id_inventory = ?", 1);
        if (str20 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str20);
        }
        this.f14553a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14553a, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "id_inventory");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, KeyConst.KEY_AUIT);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "age_to");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "best_to_drink_date");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date_added");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date_removed");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "grape_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "favorite");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "personal_notes");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "region");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "country");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "shelf_position");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "exact_position");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "vintage");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "vivino_id");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "wine_type");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "winery");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "image_url");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "last_changed");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "categoryId");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "dateEnterd");
                if (query.moveToFirst()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        l = null;
                    } else {
                        l = Long.valueOf(query.getLong(columnIndexOrThrow5));
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str5 = null;
                    } else {
                        str5 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str6 = null;
                    } else {
                        str6 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str7 = null;
                    } else {
                        str7 = query.getString(columnIndexOrThrow8);
                    }
                    List<String> strList = this.f14555c.toStrList(str7);
                    if (query.isNull(columnIndexOrThrow9)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(query.getInt(columnIndexOrThrow9));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(num.intValue() != 0);
                    }
                    if (query.isNull(columnIndexOrThrow10)) {
                        str8 = null;
                    } else {
                        str8 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        str9 = null;
                    } else {
                        str9 = query.getString(columnIndexOrThrow11);
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        str10 = null;
                    } else {
                        str10 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        i = columnIndexOrThrow14;
                        str11 = null;
                    } else {
                        str11 = query.getString(columnIndexOrThrow13);
                        i = columnIndexOrThrow14;
                    }
                    if (query.isNull(i)) {
                        i2 = columnIndexOrThrow15;
                        str12 = null;
                    } else {
                        str12 = query.getString(i);
                        i2 = columnIndexOrThrow15;
                    }
                    if (query.isNull(i2)) {
                        i3 = columnIndexOrThrow16;
                        str13 = null;
                    } else {
                        str13 = query.getString(i2);
                        i3 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i3)) {
                        i4 = columnIndexOrThrow17;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(query.getLong(i3));
                        i4 = columnIndexOrThrow17;
                    }
                    if (query.isNull(i4)) {
                        i5 = columnIndexOrThrow18;
                        str14 = null;
                    } else {
                        str14 = query.getString(i4);
                        i5 = columnIndexOrThrow18;
                    }
                    if (query.isNull(i5)) {
                        i6 = columnIndexOrThrow19;
                        str15 = null;
                    } else {
                        str15 = query.getString(i5);
                        i6 = columnIndexOrThrow19;
                    }
                    if (query.isNull(i6)) {
                        i7 = columnIndexOrThrow20;
                        str16 = null;
                    } else {
                        str16 = query.getString(i6);
                        i7 = columnIndexOrThrow20;
                    }
                    if (query.isNull(i7)) {
                        i8 = columnIndexOrThrow21;
                        str17 = null;
                    } else {
                        str17 = query.getString(i7);
                        i8 = columnIndexOrThrow21;
                    }
                    if (query.isNull(i8)) {
                        i9 = columnIndexOrThrow22;
                        str18 = null;
                    } else {
                        str18 = query.getString(i8);
                        i9 = columnIndexOrThrow22;
                    }
                    if (query.isNull(i9)) {
                        str19 = null;
                    } else {
                        str19 = query.getString(i9);
                    }
                    wineInventoryEntity = new WineInventoryEntity(j, str2, str3, str4, l, str5, str6, strList, bool, str8, str9, str10, str11, str12, str13, l2, str14, str15, str16, str17, str18, str19, query.getLong(columnIndexOrThrow23));
                } else {
                    wineInventoryEntity = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return wineInventoryEntity;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public void updateDateRemovedByIdInv(String str, String str2) {
        this.f14553a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14561i.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        if (str2 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str2);
        }
        this.f14553a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
            this.f14561i.release(acquire);
        }
    }

    public void updateTicketModel(TicketBean ticketBean) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            this.f14559g.handle(ticketBean);
            this.f14553a.setTransactionSuccessful();
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public int updateWineInventories(List<WineInventoryEntity> list) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            int handleMultiple = this.f14558f.handleMultiple(list) + 0;
            this.f14553a.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.f14553a.endTransaction();
        }
    }

    public int updateWineInventory(WineInventoryEntity wineInventoryEntity) {
        this.f14553a.assertNotSuspendingTransaction();
        this.f14553a.beginTransaction();
        try {
            int handle = this.f14558f.handle(wineInventoryEntity) + 0;
            this.f14553a.setTransactionSuccessful();
            return handle;
        } finally {
            this.f14553a.endTransaction();
        }
    }
}
