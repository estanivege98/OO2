package org.example;

import java.util.*;

public class DatabaseRealAccess implements DatabaseAccess {
    private Map<String, List<String>> data;
    private int currentId;

    public DatabaseRealAccess(Map<String, List<String>> data) {
        super();
        this.data = data;
        this.currentId = 3;
        this.data.put("select * from comics where id=1", Arrays.asList("Spiderman", "Marvel"));
        this.data.put("select * from comics where id=2", Arrays.asList("Batman", "DC comics"));
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        this.data.put("select * from comics where id=" + this.currentId, rowData);
        this.currentId = this.currentId + 1;

        return this.currentId - 1;
    }

    @Override
    public Collection<String> getSearchResults(String queryString){
        return this.data.getOrDefault(queryString, Collections.emptyList());
    }

}
