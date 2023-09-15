package org.classes;

public abstract class Drug implements Sellable{

    protected String  name_;
    protected String  manufacturer_;
    protected float   price_;
    protected float   cost_;
    protected float   vat_;

    public abstract int getExtra();

}
