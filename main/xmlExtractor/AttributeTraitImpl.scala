package xmlExtractor

import scala.xml.Elem
import scala.xml.Node

/**
 * Implement Trait to extract pertinent data 
 * @author SENDI
 */
class AttributeTraitImpl extends AttributeTrait {
  
  /**
   * Function That get The list of artist from Node XMl
   * @return all artist node in form of sequence
   */
  override def getArtist(element :Elem):Seq[Node] = {
    
    val nodeseq = element.child
    nodeseq  
  }
  /**
   * Function That get The list of Album for a giving Artist
   */
  override def getAlbum(node :Node):Seq[Node] = {
    val nodeseq = node.child
    nodeseq   
  }
  /**
   * Function That get The list of songs for a giving Album
   */
  override def getSongs(node:Node) :Seq[Node] ={
     val nodeseq = node.child
       nodeseq   
  }  
  override def getAttribute(node:Node , attribute :String):String = {
    val result = node.child
    val result1 = result(0)
     result1.toString()
  }
  /**
   * Implement  @getListArtist()
   */
  override def getListArtist() : List[String]={
    val file = new Xml()
    val element = file.getNode("/music.xml")
    val artistNode = getArtist(element)
    var artistName = artistNode.map(x =>x.attributes.get("name"))
      artistName.filter(x => x!=None).map(x => x.get.toString()).toList
    
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