package xmlExtractor

object MainObject {
  
  
  def main(args :Array[String]): Unit = {
    val node = new Xml()
    val seqNode = node.getNode("/music.xml")
    val att = new AttributeTraitImpl()
    println(att.getAlbum(att.getArtist(seqNode)(1))(1))
  }
  
}