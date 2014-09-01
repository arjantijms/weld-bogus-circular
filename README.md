weld-bogus-circular
===================

Reproducer case for bogus warning about circular injection in Weld

This project demonstrates an issue where injecting two or more fields from the same producer that's created when the injected bean is created will generate a bogus error message:

> WELD-000018: Executing producer field or method [BackedAnnotatedMethod] @Produces public test.ProducerBean.produce() on incomplete declaring bean Managed Bean [class test.ProducerBean] with qualifiers [@Any @Default] due to circular injection

When deploying on localhost, the following URLs will demonstrate the issue:

* http://localhost:8080/weld-bogus-circular/servlet