package com.rcmcreativedesign.weighttracker;

import com.rcmcreativedesign.weighttracker.model.WeightRecord;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CreateRecordUnitTests {
    private ArrayList<WeightRecord> records = new ArrayList<WeightRecord>();

    @Test
    public void addNewRecordTest() {
        records.add(new WeightRecord(1, 162.2));

        Assert.assertEquals(1, records.size());
        Assert.assertEquals(1, records.get(0).Id);
    }

    @Test
    public void getNextRecordIdTest() {
        int nextId = getNextRecordId(records);
        Assert.assertEquals(1, getNextRecordId(records));

        records.add(new WeightRecord(nextId, 162.2));
        int secondId = getNextRecordId(records);
        Assert.assertEquals(2, secondId);
    }

    private int getNextRecordId(ArrayList<WeightRecord> records) {
        int highestId = 0;
        for (WeightRecord r : records) {
            if (r.Id > highestId)
                highestId = r.Id;
        }
        return highestId + 1;
    }
}

