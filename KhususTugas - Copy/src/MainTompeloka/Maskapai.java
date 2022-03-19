package MainTompeloka;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author F
 */
public class Maskapai{
        private SimpleStringProperty pesawat;
        private SimpleStringProperty berangkat;
        private SimpleStringProperty tiba;
        private SimpleStringProperty harga;
        private SimpleStringProperty resource;
        
        private double hargaDouble;
        
        public Maskapai(String pesawat, double berangkat, double tiba, double harga,String resource) {
            hargaDouble = harga;
            
            DecimalFormatSymbols waktu = new DecimalFormatSymbols(Locale.GERMAN);
            waktu.setDecimalSeparator(':');
            DecimalFormat jam = new DecimalFormat("00.00", waktu);
            
            NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
            DecimalFormat df = (DecimalFormat) nf;
            
            this.pesawat    = new SimpleStringProperty(pesawat);
            this.berangkat  = new SimpleStringProperty(jam.format(berangkat));
            this.tiba       = new SimpleStringProperty(jam.format(tiba));
            this.harga      = new SimpleStringProperty(df.format(harga));
            this.resource   = new SimpleStringProperty(resource);
        }

        public String getPesawat() {
            return pesawat.get();
        }

        public String getBerangkat() {
            return berangkat.get();
        }
        
        public String getTiba() {
            return tiba.get();
        }

        public String getHarga() {
            return harga.get();
        }
        
        public String getResource() {
            return resource.get();
        }

        public Double getDoubleHarga(){
            return hargaDouble;
        }
        
        public SimpleStringProperty pesawatProperty() {
            return pesawat;
        }

        public SimpleStringProperty berangkatProperty() {
            return berangkat;
        }

        public SimpleStringProperty tibaProperty() {
            return tiba;
        }
        
        public SimpleStringProperty hargaProperty(){
            return harga;
        }
        
        public SimpleStringProperty resourceProperty() {
            return resource;
        }
    }