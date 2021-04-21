package com.rcmcreativedesign.weighttracker.model;

import java.util.Date;

public class WeightRecord {
    public int Id;
    public double Weight;
    public Date Timestamp;

    public WeightRecord(int id, double weight) {
        this.Id = id;
        this.Weight = weight;
        this.Timestamp = new Date(System.currentTimeMillis());
    }
}
