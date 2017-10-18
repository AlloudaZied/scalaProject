package xmlExtractor


object MainObject {

  /**
   * Test the Parser 
   */ 
  def main(args :Array[String]): Unit = {
    val context = new AttributeTraitImpl()
    val listArtist = context.getListArtist()   
    listArtist.foreach(x => println("Artist :" + x +"\n" ))       
  }  
}