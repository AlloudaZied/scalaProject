package xmlExtractor


object MainObject {
  
  /**
   * Test the Parser 
   */ 
  def main(args :Array[String]): Unit = {
    val context = new AttributeTraitImpl()
    val listArtist = context.getListArtist()   
    val listAlbum = context.getAlbumByArtist()
    val resultList = listAlbum.map(x => x.get.toString())
    
    resultList.foreach(x =>println(x))
   
  }  
}