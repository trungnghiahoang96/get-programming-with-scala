
package ammonite
package $file.src.main.scala.listings
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object `Listing-1.4`{
/*<script>*/var a = "hello"
/*<amm>*/val res_1 = /*</amm>*/println(a)
/*<amm>*/val res_2 = /*</amm>*/a = "Scala - Apache Spark"
/*<amm>*/val res_3 = /*</amm>*/println(a)
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "Listing$minus1$u002E4"
  /*</generated>*/
}
