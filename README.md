# reproducer-grammarly-textinput

This repro contain a reproducer for a ANR with the Samsung Keyboard with Grammarly integration turned on.
The repo contains a vanilla Android app.

Credits to [@NickGerleman](https://github.com/NickGerleman) for discovering it.

## How to install

Clone the repo and install with:

```bash
./gradlew installDebug
```

## How to reproduce

1. Make sure you're on a Samsung device with the Samsung Keyboard and Grammarly integration turned on (the feature is called `Suggests text corrections` in the Keyboard settings).
2. Install the app as described above.
3. Open the app and tap on the text input.
4. Copy paste a wall of text (like a Lorem Ipsum)
5. Start typing and the ANR will happen.

<p align="center">
  <img src="assets/reproducervideo.gif" alt="gif" width="50%"/>
</p>
