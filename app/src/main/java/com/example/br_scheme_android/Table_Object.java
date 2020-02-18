package com.example.br_scheme_android;

public class Table_Object {
    public int Id;
    public String Key;
    public String Src;
    public int Angle;
    public String Pos;
    public String Group;
    public int MaxGuests;
    public int MinGuests;
    public int Number;
    public String Size;
    public String Figure;

    public Table_Object(int Id, String Key, String Src, int Angle, String Pos, String Group,
                        int MaxGuests, int MinGuests, int Number, String Size, String Figure) {
        this.Id = Id;
        this.Key = Key;
        this.Src = Src;
        this.Angle = Angle;
        this.Pos = Pos;
        this.Group = Group;
        this.MaxGuests = MaxGuests;
        this.MinGuests = MinGuests;
        this.Number = Number;
        this.Size = Size;
        this.Figure = Figure;
    }
}
