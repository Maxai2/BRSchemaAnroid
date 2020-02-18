package com.example.br_scheme_android;

public class Scheme_Element {

    public int HallId;
    public String HallTitle;
    Table_Object[] table_objects;
    Hall_Object[] hall_objects;
    Group_Array[] group_arrays;

    public Scheme_Element(int HallId, String HallTitle, Table_Object[] table_objects, Hall_Object[] hall_objects, Group_Array[] group_arrays) {
        this.HallId = HallId;
        this.HallTitle = HallTitle;
        this.table_objects = table_objects;
        this.hall_objects = hall_objects;
        this.group_arrays = group_arrays;
    }
}
