package com.songrApp.songr.SongPackage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository <Song,Long> {
}
