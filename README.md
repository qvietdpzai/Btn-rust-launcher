<p align="center">
  <h1 align="center">btn rust launcher</h1>
  <p align="center">A high-performance Minecraft: Java Edition client, written from scratch in Rust and Vulkan</p>
  <p align="center">
    <a href="#download"><b>Download</b></a> · <a href="https://discord.gg/ucBA55bHPR"><b>Discord</b></a> · <a href="./BUILDING.md"><b>Build from source</b></a> · <a href="./CONTRIBUTING.md"><b>Contributing</b></a>
  </p>
</p>

---

btn rust launcher contains no Mojang code, and joins vanilla servers from 1.20 through 26.3.

<p align="center">
  <img width="100%" alt="btn rust launcher flying over a jungle" src="https://github.com/user-attachments/assets/c35e717e-3535-4f4f-9539-9e62dd482e04" />
</p>

## Download

Get btn rust launcher from the [latest release](https://github.com/qvietdpzai/Btn-rust-launcher/releases/latest):

- **Windows x64**: `btn-rust-launcher-windows-x64-setup.exe`
- **macOS (Apple Silicon)**: `btn-rust-launcher-macos-arm64.dmg`, then drag btn rust launcher to Applications
- **Linux x64**: `btn-rust-launcher-linux-x64-gnu.AppImage`

It signs you in with your Microsoft account and keeps itself up to date. You need to own Minecraft: Java Edition. The builds aren't signed yet, so the first launch needs one extra step, described in the release notes.

Early Android and iOS builds build from source: see [BUILDING.md](./BUILDING.md).

## Why btn rust launcher?

- **No JVM**: a native binary, so there's no Java to install or tune.
- **Vanilla behaviour**: physics, rendering, menus and networking are ported line by line from the decompiled game, and checked against it.
- **Tested against real servers**: scripted [in-game tests](./tests/ingame/README.md) run the client against a vanilla 26.2 server and screenshot the results.
- **Many versions, one client**: per-version protocol tables are generated from each version's decompiled source, and other versions are translated to 26.2.

> [!WARNING]
> btn rust launcher is in active development. Expect missing features and bugs, and please report them in [Issues](https://github.com/qvietdpzai/Btn-rust-launcher/issues) or on Discord.

## Features

- **Rendering**: chunk meshing, GPU frustum and cave-occlusion culling, smooth lighting, water and lava, mobs with skins, particles, weather, clouds and sky
- **Singleplayer**: worlds run on [SteelMC](https://github.com/Steel-Foundation/SteelMC), a Rust server embedded in the client
- **Audio**: vanilla sound events, music and subtitles through OpenAL Soft
- **Resource packs**: local and server-sent packs, applied live
- **Inventories**: survival and creative inventories, crafting, furnaces, anvils, enchanting, chests, bundles and the recipe book
- **Controls**: rebindable keys and controllers on desktop, touch controls on phones
- **Friends**: the Minecraft friends list, requests and who's online
- **Updates**: installs per platform and keeps itself up to date

<details>
<summary>Everything else</summary>

- Vanilla-exact movement, collision, swimming and drowning
- Block entities, dropped items, block overlays and hand animation
- HUD and menus: health, hunger, air, status effects, hotbar, boss bars, titles, waypoints, advancement toasts, player list, F3 debug, chat, pause menu, options, server list, world list
- Create, edit and delete singleplayer worlds from the menu
- Microsoft sign-in from the menu, with tokens stored in the OS keyring
- Secure chat: signed messages, as vanilla sends them
- Discord presence for the menu, servers and worlds

</details>

## Building from source

See [BUILDING.md](./BUILDING.md) for building the client, running the client standalone, and the development commands.

## Contributing

Contributions are welcome. Please open an issue first to discuss what you'd like to change, and see [CONTRIBUTING.md](./CONTRIBUTING.md) for the workflow.

## License

btn rust launcher is licensed under the [GNU General Public License v3.0 or later](./LICENSE) (GPL-3.0-or-later). Copyright (C) 2026 Purdze.

`btn-singleplayer` links [SteelMC](./third_party/SteelMC) and is therefore AGPL-3.0-or-later. The [allocator crate](./btn-gpu-allocator) is MIT, a port of the [gpu-allocator crate](https://github.com/Traverse-Research/gpu-allocator) by Traverse Research, and [btn-block](./btn-block) is likewise MIT. See [THIRD_PARTY_LICENSES.md](./THIRD_PARTY_LICENSES.md) for the other third-party code.

btn rust launcher is not affiliated with or endorsed by Mojang Studios or Microsoft. Minecraft is a trademark of Mojang Studios.

## Community

[![Discord](https://img.shields.io/discord/1483578136544280618?color=5865F2&label=Discord&logo=discord&logoColor=white)](https://discord.gg/ucBA55bHPR)

<details>
<summary>Star history</summary>

<a href="https://www.star-history.com/?repos=qvietdpzai%2FBtn-rust-launcher&type=date&logscale=&legend=top-left">
 <picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://api.star-history.com/chart?repos=qvietdpzai%2FBtn-rust-launcher&type=date&theme=dark&logscale&legend=top-left" />
  <source media="(prefers-color-scheme: light)" srcset="https://api.star-history.com/chart?repos=qvietdpzai%2FBtn-rust-launcher&type=date&logscale&legend=top-left" />
  <img alt="Star History Chart" src="https://api.star-history.com/chart?repos=qvietdpzai%2FBtn-rust-launcher&type=date&logscale&legend=top-left" />
 </picture>
</a>

</details>
