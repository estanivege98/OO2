package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {
    private DatabaseAccess DB;
    private String auth;
    private boolean access;

    public DatabaseProxyAccess(DatabaseAccess DB, String auth, boolean access) {
        this.DB = DB;
        this.auth = auth;
        this.access = access;
    }

    public boolean authDataBase(String auth){
        if(this.auth.equals(auth)){
            this.access = true;
            return true;
        }
        return false;
    }

    public Collection<String> getSearchResults(String queryString){
        if(this.access){
            return this.DB.getSearchResults(queryString);
        }
        return Collections.emptyList();
    }

    public int insertNewRow(List<String> rowData){
        if(this.access){
            return this.DB.insertNewRow(rowData);
        }
        return -1;
    }
}
