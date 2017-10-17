package trasformXml

import scala.xml.Node

trait TransformTrait {
  
  /**
   * Create List of artist
   */
  
  def getListArtist():List[Seq[Node]]
  
  /**
   * Getting all album for every artist
   */
  def getAlbumByArtist()
  
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