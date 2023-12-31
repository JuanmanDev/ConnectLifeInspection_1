package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.sqlite.p031db.SimpleSQLiteQuery;
import androidx.sqlite.p031db.SupportSQLiteQuery;
import androidx.test.internal.runner.RunnerArgs;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class RawQueries {
    public static void bindings(@NonNull StringBuilder sb, int i) {
        if (i > 0) {
            sb.append("?");
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
                sb.append("?");
            }
        }
    }

    @NonNull
    public static SupportSQLiteQuery workQueryToRawQuery(@NonNull WorkQuery workQuery) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = workQuery.getStates();
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(states.size());
            for (WorkInfo.State stateToInt : states) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(stateToInt)));
            }
            sb.append(str2);
            sb.append(" state IN (");
            bindings(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = str;
        }
        List<UUID> ids = workQuery.getIds();
        if (!ids.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(ids.size());
            for (UUID uuid : ids) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            bindings(sb, ids.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = str;
        }
        List<String> tags = workQuery.getTags();
        if (!tags.isEmpty()) {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb, tags.size());
            sb.append("))");
            arrayList.addAll(tags);
        } else {
            str = str2;
        }
        List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb, uniqueWorkNames.size());
            sb.append("))");
            arrayList.addAll(uniqueWorkNames);
        }
        sb.append(MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR);
        return new SimpleSQLiteQuery(sb.toString(), arrayList.toArray());
    }
}
