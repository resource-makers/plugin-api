[![card](https://stats.maximjsx.com/api/pin-wide/?username=resource-makers&repo=plugin-api&dark_bg=3&height=150&theme=rain&description=Minecraft%20resource%20management%20API%20for%20Packforge%0ACustom%20%20blocks%2C%20items%2C%20sounds%20%26%20fonts&title=Packforge%20API)](https://github.com/resource-makers/plugin-api)

<div align="center">
  <a href="https://jitpack.io/#resource-makers/plugin-api"><img src="https://jitpack.io/v/resource-makers/plugin-api.svg" /></a>
  <a href="https://adoptium.net/"><img src="https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk" /></a>
  <a href="https://papermc.io/"><img src="https://img.shields.io/badge/Minecraft%20-1.21.4%2B-yellowgreen" /></a>
</div>


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

## Features
- **Resource Management**: Central cache for custom blocks, items, fonts, and sounds
- **Custom Events**: Cancellable interactions for custom blocks and items
- **Runtime Utilities**: ItemStack generation, sound playback, and block placement
  

### API Initialization
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
Block block = api.getBlock("lock_amethyst");
Item item = api.getItem(142);
Font font = api.getFont("custom_font");
Sound sound = api.getSound("test_sound");

List<Item> allItems = api.getItems();
```
  
**ItemStack creation and manipulation:**
```java
ItemStack blockItem = packforge.getItemStack(customBlock);
ItemStack itemStack = packforge.getItemStack(customItem);
packforge.applyItemProperties(existingItemStack, customItem);
```
  
**Player interaction:**
```java
packforge.addToInventory(player, customItem, 5 /*optional amount*/);
packforge.playSound(customSound, player);
```
  
**Block placement:**
```java
packforge.placeBlock(location, customBlock);
```

---

## Events

### CustomBlockBreakEvent *(Cancellable)*
```java
@EventHandler
public void onBlockBreak(CustomBlockBreakEvent e) {
    if (e.getCustomBlock().getName().equals("protected_block")) {
        e.setCancelled(true);
    }
}
```
- **Methods**: `getBlock()`, `getCustomBlock()`, `getPlayer()`

### CustomBlockInteractEvent
- **Methods**: `getBlock()`, `getCustomBlock()`, `getAction()`, `getPlayer()`

### CustomBlockPlaceEvent *(Cancellable)*
- **Methods**: `getBlock()`, `getReplacedBlockState()`, `getCustomBlock()`, `getPlayer()`

### CustomItemInteractEvent *(Cancellable)*
```java
@EventHandler
public void onItemInteract(CustomItemInteractEvent e) {
    if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
        e.setCancelled(true);
    }
}
```
- **Methods**: `getPlayer()`, `getItemStack()`, `getCustomItem()`, `getAction()`

