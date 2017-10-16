package xmlExtractor

object MainObject {
  
  
  def main(args :Array[String]): Unit = {
    val node = new Xml()
    val seqNode = node.getNode("/music.xml")
    val att = new AttributeTraitImpl()
    val  result = att.getSongs(att.getAlbum(att.getArtist(seqNode)(1))(1))(1)
    val artist = att.getArtist(seqNode)(1)
    val album = att.getAlbum(artist)(1)
    val song = att.getSongs(album)(1)
    val attribute = "title"
    val rs = att.getAttribute(album, attribute).get
    println(rs)
  }
  
}