package xmlExtractor

import scala.xml.NodeSeq
import scala.xml.Elem

trait AttributeTrait[NodSeq] {
  
  def getArtist(file :Elem) :List[String]
  def getAlbum():List[String]
  def getSongs() :List[String]
}