<img width="400" alt="CD disk with rainbow chroma on left followed by the strings 'Jamfish' on top and 'Delicious music client for Jellyfin' at the bottom." src="https://github.com/user-attachments/assets/993fae4a-f4e0-459d-b9ca-85ce548f1dea" />

# Introduction

This is a native music player for Android devices that connects to Jellyfin media servers. The code is based on Gelli's archived repository, which is based on an old version of Phonograph. Jamfish is made for personal use, but contributions are welcome! Please open an issue to discuss larger changes before submitting a pull request.

# Screenshots

<img width="4320" height="1560" alt="image(4)" src="https://github.com/user-attachments/assets/cba1fa13-9aae-44a6-94de-af5fdac8456f" />

# Features

> [!TIP]
> Song 'caching' is not available on Jamfish, only downloading to internal storage. If you want this feature, please use Gelli, the reason I forked it was to remove that function in favor of downloads. If this feature is ever added again it will work with downloaded songs for more flexibility. **Downloads will not be used when streaming.**

* Basic library navigation
* Download songs to internal storage individually or through batch actions
* Gapless playback
* Sort albums and songs by different fields
* Search media for partial matches
* Media service integration with notification
* Favorites and playlists
* Playback history reporting
* Filter content by library

# Requisites
- A Jellfin server. See how to setup one [here](https://jellyfin.org/docs/general/quick-start/).
- Android 4.4 or later

# Issues

Since this was a small project intended mainly for myself, there are some things I haven't resolved yet. I would appreciate pull requests to fix any of these issues!

* Artist sorting isn't available through the API
* Playlists and favorites will not update automatically when changed ([#5](https://github.com/adrianvic/jamfish/issues/5))
* App may crash on really low end devices due exceeding the maximum bitmap memory ([#4](https://github.com/adrianvic/jamfish/issues/4))

# Future Plans

If I ever find the time, these are some of the items I would potentially include.

* Interface overhaul
* Playing device songs
* SyncPlay (Jellyfin built-in watchparty)
* Smart playlists
* Session controls
* QuickConnect
* Support for videoclips
* Chromecast
* Android Auto
