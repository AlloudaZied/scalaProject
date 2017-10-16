package xmlExtractor

object MainObject {
  
  
  def main(args :Array[String]): Unit = {
    val node = new Xml()
    val seqNode = node.getNode("/music.xml")
    val att = new AttributeTraitImpl()
    val  result = att.getSongs(att.getAlbum(att.getArtist(seqNode)(1))(1))(1)
    val rs =result.attribute("title")
    println(rs)
  }
  
}