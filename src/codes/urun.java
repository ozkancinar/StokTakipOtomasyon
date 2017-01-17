/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ozkan
 */
public class urun {
    private String urun_grubu, urun_kodu,urun_marka,musteri_ad;
    private int grup_id,marka_id,musteri_id;
    PreparedStatement ps;
    ResultSet rs;
    public boolean UrunGrubuEkle(urun U_urunler) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        try {
            String sorgu = "insert into urun_grup (tur) values ('"+U_urunler.getUrun_grubu()+"')";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    public boolean UrunEkle(String urunKodu, int grupId, int MarkaId) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        try {
            String sorgu = "insert into urunler (grup_id, urun_kodu, marka_id) values ("+grupId+",'"+urunKodu+"',"+MarkaId+")";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    public int UrunIdBul(String urun_kodu, int markaId, int grupId) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        
        int id = 0;
        Statement st = vb.con.createStatement();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select id from urunler where urun_kodu='"+urun_kodu+"'and grup_id="+grupId+"";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              id = rs.getInt(1);
          }
         ps.close();
         rs.close();
         vb.con.close();
         return id;
    }
    public boolean UrunSil(int urun_id) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        try{ 
        String sorgu = "Delete from urunler where id="+urun_id+"";
        ps = vb.con.prepareStatement(sorgu);
        ps.executeUpdate();
        ps.close();
        vb.con.close();
        return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
      }
     public boolean MarkaEkle(urun U_urunler) throws SQLException{
          baglanti vb = new baglanti();
        vb.baglan();
        try {
            String sorgu = "insert into markalar (marka) values ('"+U_urunler.getUrun_marka()+"')";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
     }
     
       public List<urun> MarkalarHepsi() throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        String sicil;String ad;String soyad;
        Statement st = vb.con.createStatement();
        List<urun> urunlist = new ArrayList<>();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select * from markalar";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setMarka_id(rs.getInt("id"));
              urunGruplari[i].setUrun_marka(rs.getString("marka"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
      } 
      public int GrupIdAl(String grup) throws SQLException{
          baglanti vb = new baglanti();
        vb.baglan();
        
        int id = 0;
        Statement st = vb.con.createStatement();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select id from urun_grup where tur='"+grup+"'";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              id = rs.getInt(1);
          }
         ps.close();
         rs.close();
         vb.con.close();
          return id;
      }
      public boolean UrunGrupSil(int id) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        try{ 
        String sorgu = "Delete from urun_grup where id="+id+"";
        ps = vb.con.prepareStatement(sorgu);
        ps.executeUpdate();
        ps.close();
        vb.con.close();
        return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
      }
       public int MarkaIdAl(String marka) throws SQLException{
          baglanti vb = new baglanti();
        vb.baglan();
        
        int id = 0;
        Statement st = vb.con.createStatement();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select id from markalar where marka='"+marka+"'";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
             id = rs.getInt(1);
          }
         ps.close();
         rs.close();
         vb.con.close();
         return id;
      }
       public String MarkaAdiAl(int marka_id) throws SQLException{
            baglanti vb = new baglanti();
        vb.baglan();
        String marka = "";
        Statement st = vb.con.createStatement();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select marka from markalar where id="+marka_id+"";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
             marka = rs.getString(1);
          }
         ps.close();
         rs.close();
         vb.con.close();
         return marka;
       }
       public boolean MarkaSil(int id) throws SQLException{
           baglanti vb = new baglanti();
        vb.baglan();
        try{ 
        String sorgu = "Delete from markalar where id="+id+"";
        ps = vb.con.prepareStatement(sorgu);
        ps.executeUpdate();
        ps.close();
        vb.con.close();
        return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
       }
       public boolean MarkaGuncelle(int id, String metin) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        
        try {
            String sorgu = "update markalar set marka='"+metin+"' where id="+id+"";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            ps.close();
            vb.con.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
       }
       public boolean UrunGrupGuncelle(int id, String metin) throws SQLException{
           baglanti vb = new baglanti();
        vb.baglan();
        
        try {
            String sorgu = "update urun_grup set tur='"+metin+"' where id="+id+"";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            ps.close();
            vb.con.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
       }
       public boolean MusteriGuncelle(int id, String metin) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        
        try {
            String sorgu = "update musteriler set ad='"+metin+"' where id="+id+"";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            ps.close();
            vb.con.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
       }
      public List<urun> UrunKoduAra(String urunKodu) throws SQLException{
         baglanti vb = new baglanti();
        vb.baglan();
        String sicil;String ad;String soyad;
        Statement st = vb.con.createStatement();
        List<urun> urunlist = new ArrayList<>();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select * from urunler where urun_kodu like '"+urunKodu+"%'";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setGrup_id(rs.getInt("grup_id"));
              urunGruplari[i].setMarka_id(rs.getInt("marka_id"));
              urunGruplari[i].setUrun_kodu(rs.getString("urun_kodu"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
      }
      public List<urun> UrunKoduBul(int markaId, int grupId) throws SQLException{
          baglanti vb = new baglanti();
        vb.baglan();
        String sicil;String ad;String soyad;
        Statement st = vb.con.createStatement();
        List<urun> urunlist = new ArrayList<>();
        urun[] urunGruplari;
        String sorgu;
        if(grupId!=0 && markaId==0){
            
        sorgu="select * from urunler where grup_id="+grupId+"";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setGrup_id(rs.getInt("grup_id"));
              urunGruplari[i].setMarka_id(rs.getInt("marka_id"));
              urunGruplari[i].setUrun_kodu(rs.getString("urun_kodu"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
        }
        else if(markaId!=0 && grupId==0){
        String sorgu1 = "select * from urunler where marka_id="+markaId+"";
        ps = vb.con.prepareStatement(sorgu1);
        rs = ps.executeQuery(sorgu1);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu1);
        rs = ps.executeQuery(sorgu1);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setGrup_id(rs.getInt("grup_id"));
              urunGruplari[i].setMarka_id(rs.getInt("marka_id"));
              urunGruplari[i].setUrun_kodu(rs.getString("urun_kodu"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
        }
        else if(markaId!=0 && grupId!=0){
        String sorgu2 = "select * from urunler where marka_id="+markaId+" and grup_id="+grupId+"";
        ps = vb.con.prepareStatement(sorgu2);
        rs = ps.executeQuery(sorgu2);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu2);
        rs = ps.executeQuery(sorgu2);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setGrup_id(rs.getInt("grup_id"));
              urunGruplari[i].setMarka_id(rs.getInt("marka_id"));
              urunGruplari[i].setUrun_kodu(rs.getString("urun_kodu"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
        }else{
           return urunlist;
        }
      }
      public boolean UrunKoduEkle(urun urunler) throws SQLException{
            baglanti vb = new baglanti();
        vb.baglan();
        try {
            String sorgu = "insert into urunler (grup_id,urun_kodu,marka_id) values (?,?,?)";
            ps = vb.con.prepareStatement(sorgu);
            ps.setInt(1,urunler.getGrup_id());
            ps.setString(2, urunler.getUrun_kodu());
            ps.setInt(3, urunler.getMarka_id());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
      }
      public boolean MusteriEkle(String M_ad) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        try {
            String sorgu = "insert into musteriler (ad) values ('"+M_ad+"')";
            ps = vb.con.prepareStatement(sorgu);
            ps.executeUpdate();
            ps.close();
            vb.con.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
      }
      public int MusteriIdBul(String M_ad) throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        String sorgu="Select id from musteriler where ad='"+M_ad+"'";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int id = 0;
        while(rs.next()){
            id=rs.getInt(1);
        }
        return id;
      }
      public boolean MusteriSil(int id) throws SQLException{
       baglanti vb = new baglanti();
        vb.baglan();
        try{ 
        String sorgu = "Delete from musteriler where id="+id+"";
        ps = vb.con.prepareStatement(sorgu);
        ps.executeUpdate();
        ps.close();
        vb.con.close();
        return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
      }
      public List<urun> UrunGrubuHepsi() throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        String sicil;String ad;String soyad;
        Statement st = vb.con.createStatement();
        List<urun> urunlist = new ArrayList<>();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select * from urun_grup";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setGrup_id(rs.getInt("id"));
              urunGruplari[i].setUrun_grubu(rs.getString("tur"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
      } 
      public List<urun> UrunKoduHepsi() throws SQLException{
        baglanti vb = new baglanti();
        vb.baglan();
        String sicil;String ad;String soyad;
        Statement st = vb.con.createStatement();
        List<urun> urunlist = new ArrayList<>();
        urun[] urunGruplari;
        String sorgu;
        sorgu="select * from urunler";
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
        int sayac=0;
         while(rs.next()){
           sayac++;
        }
        urunGruplari=new urun[sayac];
        int i =0;
        ps = vb.con.prepareStatement(sorgu);
        rs = ps.executeQuery(sorgu);
         while(rs.next()){
              urunGruplari[i] = new urun();
              urunGruplari[i].setUrun_kodu(rs.getString("urun_kodu"));
              urunGruplari[i].setMarka_id(rs.getInt("marka_id"));
              urunlist.add(urunGruplari[i]);
              i++;
          }
          return urunlist;
      } 

    public String getUrun_grubu() {
        return urun_grubu;
    }

    public void setUrun_grubu(String urun_grubu) {
        this.urun_grubu = urun_grubu;
    }

    public int getGrup_id() {
        return grup_id;
    }

    public void setGrup_id(int grup_id) {
        this.grup_id = grup_id;
    }

    public int getMarka_id() {
        return marka_id;
    }

    public void setMarka_id(int marka_id) {
        this.marka_id = marka_id;
    }

    public String getUrun_marka() {
        return urun_marka;
    }

    public String getMusteri_ad() {
        return musteri_ad;
    }

    public void setMusteri_ad(String musteri_ad) {
        this.musteri_ad = musteri_ad;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public void setUrun_marka(String urun_marka) {
        this.urun_marka = urun_marka;
    }

    public String getUrun_kodu() {
        return urun_kodu;
    }

    public void setUrun_kodu(String urun_kodu) {
        this.urun_kodu = urun_kodu;
    }
    
}
