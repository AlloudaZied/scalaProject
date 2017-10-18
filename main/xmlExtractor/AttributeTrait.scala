package xmlExtractor

import scala.xml.NodeSeq
import scala.xml.Elem
import scala.xml.Node
/**
 * Trait 
 */
trait AttributeTrait {
  /**
   * 
   */
  def getArtist(element :Elem) :Seq[Node]
  /**
   * 
   */
  def getAlbum(node :Node):Seq[Node]
  /**
   * 
   */
  def getSongs(node:Node) :Seq[Node]
  /**
   * 
   */
  def getAttribute(node:Node,attribute : String):String
   /**
   * Create List of artist
   */
  
  def getListArtist():List[String]
  
  /**
   * Getting all album for every artist
   */
  def getAlbumByArtist(node:Node):List[String]
  
  /**
   * Getting List of of songs for an album
   */
  def getSongsByAlbum ()
  
  /**
   * Save Data On Hive with static partition PARAM = Artist
   */
  def SaveToPartionnedTableHive()
  
  /**
   * Determinate the very long song for every artist on every album
   */
  def getLongSongByArtistAndAlbum()
  
  /**
   * 
   */
}