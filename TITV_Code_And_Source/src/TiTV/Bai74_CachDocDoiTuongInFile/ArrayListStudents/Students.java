package TiTV.Bai74_CachDocDoiTuongInFile.ArrayListStudents;

import java.io.Serializable;
import java.util.Objects;

public class Students implements Comparable<Students>, Serializable {
        private String maSinhVien;
        private String hoVaTen;
        private int namSinh;
        private float diemTrungBinh;


        public Students(String maSinhVien) {
            this.maSinhVien = maSinhVien;
        }

        public Students(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
            this.maSinhVien = maSinhVien;
            this.hoVaTen = hoVaTen;
            this.namSinh = namSinh;
            this.diemTrungBinh = diemTrungBinh;
        }

        public String getMaSinhVien() {
            return maSinhVien;
        }

        public void setMaSinhVien(String maSinhVien) {
            this.maSinhVien = maSinhVien;
        }

        public String getHoVaTen() {
            return hoVaTen;
        }

        public void setHoVaTen(String hoVaTen) {
            this.hoVaTen = hoVaTen;
        }

        public int getNamSinh() {
            return namSinh;
        }

        public void setNamSinh(int namSinh) {
            this.namSinh = namSinh;
        }

        public float getDiemTrungBinh() {
            return diemTrungBinh;
        }

        public void setDiemTrungBinh(float diemTrungBinh) {
            this.diemTrungBinh = diemTrungBinh;
        }



        @Override
        public String toString() {
            return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
                    + ", diemTrungBinh=" + diemTrungBinh + "]";
        }
        @Override
        public int hashCode() {
            return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Students other = (Students) obj;
            return Objects.equals(maSinhVien, other.maSinhVien);
        }


    @Override
    public int compareTo(Students o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }
}
