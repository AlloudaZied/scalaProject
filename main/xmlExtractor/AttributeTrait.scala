package xmlExtractor

import scala.xml.NodeSeq
import scala.xml.Elem
import scala.xml.Node
/**
 * Trait of parsing
 */
trait AttributeTrait[NodSeq] {
  
  def getArtist(element :Elem) :Seq[Node]
  def getAlbum(node :Node):Seq[Node]
  def getSongs(node:Node) :Seq[Node]
}