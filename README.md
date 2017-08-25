# minimal-reagent-app

A minimal example Zendesk App using reagent

## Setup

The only project dependency is Java. Running any of the scripts in `bin` will
cause Clojure (the language), Leiningen (the build tool), and any project
dependencies to be installed if they are not already.

To get an interactive development environment run:

    ./bin/repl

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

## Deployment

To create a production build run:

    ./bin/production-compile

## License

Copyright © 2014 Logan Campbell

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
