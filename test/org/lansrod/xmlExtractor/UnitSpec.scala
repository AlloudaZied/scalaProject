package org.lansrod.xmlExtractor

import org.scalatest._
/**
 * abstract base classes for your project that mix together the features you use the most
 * @author ZIED
 */
abstract class UnitSpec extends FlatSpec with Matchers with
  OptionValues with Inside with Inspectors{
  
}