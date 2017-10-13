package xmlExtractor

import scala.xml.NodeSeq

trait AttributeTrait[NodSeq] {
  
  def getArtist() :List[String]
  def getAlbum():List[String]
  def getSongs() :List[String]
}