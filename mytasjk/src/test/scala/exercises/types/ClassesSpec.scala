package exercises.types

import excercises.types.classes.Person
import org.scalatest.{FlatSpec, Matchers}

class ClassesSpec extends FlatSpec with Matchers {

  "Person" should "provide proper summary" in {

    val rafa = new Person(name = "Rafa", age = 32)

    rafa.summary shouldEqual "Rafa is 32 years old"

  }

}
