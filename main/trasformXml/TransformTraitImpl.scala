package trasformXml

import xmlExtractor.AttributeTraitImpl
import xmlExtractor.Xml
import scala.xml.Node

class TransformTraitImpl extends TransformTrait{
  /**
   * Implementation  @getListArtist()
   */
  override def getListArtist() : List[Seq[Node]]={
    val node = new Xml()
    val att = new AttributeTraitImpl()
    val musicFile = node.getNode("/music.xml")
    var result = att.getArtist(musicFile)
    
    var listArtist = result.map(x =>att.getAttribute(x, "name"))
    var listseqNode = listArtist.map(x=>x.get)
    val seqNode = listseqNode.toList
    seqNode
     
    
  }
  /**
   * 
   */
  override   def getAlbumByArtist() = {
    
  }
  /**
   * 
   */
  override   def getSongsByAlbum () = {
    
  }
  /**
   * 
   */
  override   def SaveToPartionnedTableHive() = {
    
  }
  /**
   * 
   */
  override   def getLongSongByArtistAndAlbum() = {
    
  }

  
}