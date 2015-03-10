# MapCrashDemo

For some reason SupportMapFragment crashes with NPE during init if used as a nested fragment within activity with StrictMode enabled:

```java
Caused by: java.lang.NullPointerException: null reference
            at com.google.android.gms.internal.jx.i(Unknown Source)
            at com.google.android.gms.maps.CameraUpdateFactory.a(Unknown Source)
            at com.google.android.gms.maps.MapsInitializer.a(Unknown Source)
            at com.google.android.gms.maps.MapsInitializer.initialize(Unknown Source)
            at com.google.android.gms.maps.SupportMapFragment$b.nO(Unknown Source)
            at com.google.android.gms.maps.SupportMapFragment$b.a(Unknown Source)
            at com.google.android.gms.dynamic.a.a(Unknown Source)
            at com.google.android.gms.dynamic.a.onInflate(Unknown Source)
            at com.google.android.gms.maps.SupportMapFragment.onInflate(Unknown Source)
            at android.support.v4.app.FragmentManagerImpl.onCreateView(FragmentManager.java:2158)
            at android.view.LayoutInflater$FactoryMerger.onCreateView(LayoutInflater.java:171)
            at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:727)
            at android.view.LayoutInflater.inflate(LayoutInflater.java:482)
            at android.view.LayoutInflater.inflate(LayoutInflater.java:414)
            at com.trickyandroid.mapcrashdemo.FragmentOuter.onCreateView(FragmentOuter.java:14)
```

##Repro:
- click button to open new activity
- click back to go back to initial screen
- repeat 4-5 times

##Configuration:
- Play Services version: 6.5.82
- Api: 21


