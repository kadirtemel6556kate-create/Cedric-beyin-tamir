#!/usr/bin/env sh
# Gradle wrapper script for POSIX systems
case "$(uname)" in
  Linux*|Darwin*|CYGWIN*|MINGW*|MSYS*) OS='Unix' ;;
  *) OS='Unknown' ;;
esac
if [ "$OS" = 'Unix' ]; then
    exec ./gradle/wrapper/gradle-wrapper.jar "$@"
else
    java -jar ./gradle/wrapper/gradle-wrapper.jar "$@"
fi
