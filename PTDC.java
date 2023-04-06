package lab7;

abstract class PTDC{
	public void batDau() {
		System.out.println("________");
	}
	public void tangToc() {
		System.out.println("________");
	}
	public void dungDai() {
		System.out.println("________");
	}
    abstract double layVanToc();
    private String loaiPhuongTien;
    private String layTenHangSanXuat;
    private String hangSanXuat;
    
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}
	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	public String getLayTenHangSanXuat() {
		return layTenHangSanXuat;
	}
	public void setLayTenHangSanXuat(String layTenHangSanXuat) {
		this.layTenHangSanXuat = layTenHangSanXuat;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

}
