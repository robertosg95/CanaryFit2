package es.ulpgc.eite.CanaryFit.android.database;

public class DatabaseClauseArg {

    public String key;
    public String val;
    public String cond;

    public DatabaseClauseArg(String k, String c, String v) {
        key = k;
        val = v;
        cond = c;
    }

}
