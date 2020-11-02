# Xellitix Commons - Networking

Kotlin library providing factories + Guice modules for creating java.net objects.

## Usage

### URL

``` kotlin
object Driver {

    @JvmStatic
    fun main(args: Array<String>) {
        val urlFactory = Guice
            .createInjector(UrlFactoryModule())
            .getInstance<UrlFactory>()

        val url = try {
            urlFactory.create("https://localhost:8080/coolResource")
        } catch (ex: MalformedUrlException) {
            // Do something with exception
        }
    }
}
```

### URI 

``` kotlin
object Driver {

    @JvmStatic
    fun main(args: Array<String>) {
        val uriFactory = Guice
            .createInjector(UriFactoryModule())
            .getInstance<UriFactory>()

        val uri = try {
            uriFactory.create("data:,Hello%20World")
        } catch (ex: UriSyntaxException) {
            // Do something with exception
        }
    }
}
```

## Versioning

This project adheres to [Semantic Versioning 2.0.0](http://semver.org/).
