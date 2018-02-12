package pos.wepindia.com.retail.view.Reports.Bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by SachinV on 24-01-2018.
 */

public class DepartmentWiseReportBean implements Parcelable {
    private int deptCode;
    private String name;
    private int totalItems;
    private double discount;
    private double IGSTAmount;
    private double CGSTAmount;
    private double SGSTAmount;
    private double CESSAmount;
    private double taxableValue;

    public DepartmentWiseReportBean() {
    }

    protected DepartmentWiseReportBean(Parcel in) {
        deptCode = in.readInt();
        name = in.readString();
        totalItems = in.readInt();
        discount = in.readDouble();
        IGSTAmount = in.readDouble();
        CGSTAmount = in.readDouble();
        SGSTAmount = in.readDouble();
        CESSAmount = in.readDouble();
        taxableValue = in.readDouble();
    }

    public static final Creator<DepartmentWiseReportBean> CREATOR = new Creator<DepartmentWiseReportBean>() {
        @Override
        public DepartmentWiseReportBean createFromParcel(Parcel in) {
            return new DepartmentWiseReportBean(in);
        }

        @Override
        public DepartmentWiseReportBean[] newArray(int size) {
            return new DepartmentWiseReportBean[size];
        }
    };

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getIGSTAmount() {
        return IGSTAmount;
    }

    public void setIGSTAmount(double IGSTAmount) {
        this.IGSTAmount = IGSTAmount;
    }

    public double getCGSTAmount() {
        return CGSTAmount;
    }

    public void setCGSTAmount(double CGSTAmount) {
        this.CGSTAmount = CGSTAmount;
    }

    public double getSGSTAmount() {
        return SGSTAmount;
    }

    public void setSGSTAmount(double SGSTAmount) {
        this.SGSTAmount = SGSTAmount;
    }

    public double getCESSAmount() {
        return CESSAmount;
    }

    public void setCESSAmount(double CESSAmount) {
        this.CESSAmount = CESSAmount;
    }

    public double getTaxableValue() {
        return taxableValue;
    }

    public void setTaxableValue(double taxableValue) {
        this.taxableValue = taxableValue;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(deptCode);
        parcel.writeString(name);
        parcel.writeInt(totalItems);
        parcel.writeDouble(discount);
        parcel.writeDouble(IGSTAmount);
        parcel.writeDouble(CGSTAmount);
        parcel.writeDouble(SGSTAmount);
        parcel.writeDouble(CESSAmount);
        parcel.writeDouble(taxableValue);
    }
}
