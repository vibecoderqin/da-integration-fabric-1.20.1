# DonationAlerts Integration — Fabric 1.20.1

A Minecraft **Fabric client mod** port of [bUmmy1337/da-integration](https://github.com/bummy1337/da-integration) targeting Minecraft 1.20.1 and Java 17.

## Features

- DonationAlerts event connection and event processing.
- Configurable message and command handlers.
- Trigger and donation history screens.
- In-game settings UI and click GUI.
- Client commands for connecting to DonationAlerts and managing integration settings.

## Installation

1. Use Minecraft **1.20.1** with Fabric Loader and Fabric API installed.
2. Download `daintegrate-1.2.0.jar` from the workflow artifact linked below.
3. Put the JAR in the instance's `mods` folder and launch the game.

[Successful GitHub Actions build and artifact](https://github.com/vibecoderqin/da-integration-fabric-1.20.1/actions/runs/38199333835)

## Build locally

Install JDK 17 and Gradle 8.7, then run:

```sh
gradle --no-daemon clean build
```

The built mod JAR is written to `build/libs/daintegrate-1.2.0.jar`.

## Status

The Minecraft 1.20.1 / Java 17 project has passed the GitHub Actions compilation and JAR packaging workflow. The mod has **not yet been runtime-tested in a live Minecraft client**, so verify the DonationAlerts connection and in-game screens in your own instance before relying on it.

## Credits and license

Original project by [bUmmy1337](https://github.com/bummy1337). See [LICENSE](LICENSE).
