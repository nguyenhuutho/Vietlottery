package com.edu.gvn.vietlottery.entity.sub;

public class Mega {
        public String tenGiaiThuong;
        public String trungKhop;
        public String soLuongGiai;
        public String giaTriGiai;

        public Mega(String tenGiaiThuong, String trungKhop, String soLuongGiai, String giaTriGiai) {
            this.tenGiaiThuong = tenGiaiThuong;
            this.trungKhop = trungKhop;
            this.soLuongGiai = soLuongGiai;
            this.giaTriGiai = giaTriGiai;
        }

    @Override
    public String toString() {
        return "Mega{" +
                "tenGiaiThuong='" + tenGiaiThuong + '\'' +
                ", trungKhop='" + trungKhop + '\'' +
                ", soLuongGiai='" + soLuongGiai + '\'' +
                ", giaTriGiai='" + giaTriGiai + '\'' +
                '}';
    }
}