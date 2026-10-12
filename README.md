# DonationAlerts Integration — Fabric 1.20.1

A Minecraft **Fabric client mod** port of [bUmmy1337/da-integration](https://github.com/bummy1337/da-integration) targeting Minecraft 1.20.1 and Java 17.

## Features

- DonationAlerts event connection and event processing.
- Configurable message and command handlers.
- Trigger and donation history screens.
- In-game settings UI and click GUI.
- Client commands: `/da set`, `/da connect`, `/da disconnect`, and `/da status`.

## Build

A push or pull request runs the GitHub Actions build workflow. It builds with Java 17 and Gradle, then uploads the mod JAR as a workflow artifact.

To build locally, install JDK 17 and Gradle 8.7, then run:

```sh
gradle clean build
```

The built mod JAR is written to `build/libs/`.

## Status

This repository is a compatibility port from a newer Minecraft/Fabric API. The initial source import is being validated against Minecraft 1.20.1; do not consider the JAR production-ready until the workflow passes and the mod has been tested in-game.

## Credits and license

Original project by [bUmmy1337](https://github.com/bummy1337). See [LICENSE](LICENSE).
