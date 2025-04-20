[![](https://jitpack.io/v/resource-makers/plugin-api.svg)](https://jitpack.io/#resource-makers/plugin-api)


# Installation

### Gradle

```gradle
repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    compileOnly("com.github.resource-makers:plugin-api:1.0.0.1")
}
```

### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.resource-makers</groupId>
        <artifactId>plugin-api</artifactId>
        <version>1.0.0.1</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

## Overview
  The Packforge API provides functionality for custom blocks, items, sounds and fonts.
Retrieve the API instance using:

  ```java
  Actions packforge = Packforge.getPackforge();
  ```

## Basic Usage

  **Check existence:**
  ```java
  boolean blockExists = packforge.blockExists("lock_amethyst");
  boolean itemExists = packforge.itemExists("key_amethyst");
  ```
  
  **Get objects:**
  ```java
  Block customBlock = packforge.getBlock("lock_amethyst");
  Item customItem = packforge.getItem("key_amethyst");
  Sound customSound = packforge.getSound("test_sound");
  ```
  
  **ItemStack creation and manipulation:**
  ```java
  ItemStack blockItem = packforge.getItemStack(customBlock);
  ItemStack itemStack = packforge.getItemStack(customItem);
  packforge.applyItemProperties(existingItemStack, customItem);
  ```
  
  **Player interaction:**
  ```java
  packforge.addToInventory(player, customItem);
  packforge.playSound(customSound, player);
  ```
  
  **Block placement:**
  ```java
  packforge.placeBlock(location, customBlock);
  ```

# Events

#### CustomBlockBreakEvent (Cancellable)
- Block getBlock()
- Block getCustomBlock()
- Player getPlayer()

#### CustomBlockInteractEvent
- Block getBlock()
- Block getCustomBlock()
- Action getAction()
- Player getPlayer()

#### CustomBlockPlaceEvent (Cancellable)
- Block getBlock()
- BlockState getReplacedBlockState()
- Block getCustomBlock()
- Player getPlayer()

#### CustomItemInteractEvent (Cancellable)

- Player getPlayer()
- ItemStack getItemStack()
- Item getCustomItem()
- Action getAction()
