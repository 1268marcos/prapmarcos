import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

private  int   rId;
private String rCreationDate;
private String rTitle;
private String rEstablishment;
private int    
private rGrade;

 public class Curse (@Nullable,String title,String CreationDate,String Establishment, int Grade ) {


  title = titulo;
  
  Establishment = estabelecimento;
   
  Grade = grau do curso;
  
  CreationDate = creationDate;
}
  @PrimaryKey(autoGenarate = true)
  @NonNull
  @ColumInfo(name = "CurseId")
  private int rId;
  @Nullable
  @ColumInfo(name = "title")
  private String title

 public int getId(){
 return rId;
  }
 public void setId(int id){
  
  rId = id;
  }
 public String getTitle(){
   return rTitle;
  }
  public void setTitle(nome da string){
  rTitle= title;
  }
  public String getEstablishment(){
   return rEstablishment;
  }
  public void setEstablishment(nome da string){
  rEstablishment= Establishment ;
  }
  public int rGrade(){
  return rGrade;
  }
  public void setGradle(int grade){
  rGrade = grade;
   
  }
  public String getCreationDate(){
  return rCreationDate
  }
  public void setCreationDate(String CreationDate){
  rCreationDate = creationDate;
  }
  private int rGrade;
  private String rCreationDate ;
  }
  }
