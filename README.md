

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- Título ASTRAHUB -->
    <TextView
        android:id="@+id/tvTitulo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ASTRAHUB"
        android:textSize="24sp"
        android:textColor="#FF4081" <!-- Color rosa -->
        android:layout_centerHorizontal="true"
        android:layout_marginTop="16dp"/>

    <!-- Contenido de tu proyecto -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_below="@id/tvTitulo"
        android:layout_marginTop="16dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Este es el proyecto, realizado con Android Studio en Kotlin y XML"
            android:layout_gravity="center"/>

        <!-- Agrega aquí el resto de tus elementos de interfaz de usuario -->

    </LinearLayout>

</RelativeLayout>
