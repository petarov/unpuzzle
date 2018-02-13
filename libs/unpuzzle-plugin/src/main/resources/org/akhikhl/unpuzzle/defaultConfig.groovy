unpuzzle {

  unpuzzleDir = new File(System.getProperty('user.home'), '.unpuzzle')

  localMavenRepositoryDir = new File(unpuzzleDir, 'm2_repository')

  selectedEclipseVersion = '4.7.2'

  def suffix_os = [ 'linux': 'linux-gtk', 'macosx': 'macosx-cocoa', 'windows': 'win32' ]
  def suffix_arch = [ 'x86_32': '', 'x86_64': '-x86_64' ]
  def fileExt_os = [ 'linux': 'tar.gz', 'macosx': 'tar.gz', 'windows': 'zip' ]

  eclipseVersion('3.7.1') {

    eclipseMavenGroup = 'eclipse-indigo-sr1'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseArchiveMirror}/technology/epp/downloads/release/indigo/SR1/eclipse-jee-indigo-SR1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseArchiveMirror}/eclipse/downloads/drops/R-3.7.1-201109091335/eclipse-SDK-3.7.1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseArchiveMirror}/eclipse/downloads/drops/R-3.7.1-201109091335/eclipse-3.7.1-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/indigo/BabelLanguagePack-eclipse-${language}_3.7.0.v20131123061707.zip'
      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/indigo/BabelLanguagePack-rt.equinox-${language}_3.7.0.v20131123061707.zip'
    }
  }

  eclipseVersion('3.7.2') {

    eclipseMavenGroup = 'eclipse-indigo-sr2'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseMirror}/eclipse//technology/epp/downloads/release/indigo/SR2/eclipse-jee-indigo-SR2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseArchiveMirror}/eclipse/downloads/drops/R-3.7.2-201202080800/eclipse-SDK-3.7.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseArchiveMirror}/eclipse/downloads/drops/R-3.7.2-201202080800/eclipse-3.7.2-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/indigo/BabelLanguagePack-eclipse-${language}_3.7.0.v20131123061707.zip'
      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/indigo/BabelLanguagePack-rt.equinox-${language}_3.7.0.v20131123061707.zip'
    }
  }

  eclipseVersion('4.2.1') {

    eclipseMavenGroup = 'eclipse-juno-sr1'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseArchiveMirror}/technology/epp/downloads/release/juno/SR1/eclipse-jee-juno-SR1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.2.1-201209141800/eclipse-SDK-4.2.1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.2.1-201209141800/eclipse-4.2.1-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/juno/BabelLanguagePack-eclipse-${language}_4.2.0.v20131123041006.zip'
      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/juno/BabelLanguagePack-rt.equinox-${language}_4.2.0.v20131123041006.zip'
    }
  }

  eclipseVersion('4.2.2') {

    eclipseMavenGroup = 'eclipse-juno-sr2'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseMirror}/eclipse//technology/epp/downloads/release/juno/SR2/eclipse-jee-juno-SR2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.2.2-201302041200/eclipse-SDK-4.2.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.2.2-201302041200/eclipse-4.2.2-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/juno/BabelLanguagePack-eclipse-${language}_4.2.0.v20131123041006.zip'
      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/juno/BabelLanguagePack-rt.equinox-${language}_4.2.0.v20131123041006.zip'
    }
  }

  eclipseVersion('4.3.1') {

    eclipseMavenGroup = 'eclipse-kepler-sr1'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseArchiveMirror}/technology/epp/downloads/release/kepler/SR1/eclipse-jee-kepler-SR1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.3.1-201309111000/eclipse-SDK-4.3.1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.3.1-201309111000/eclipse-4.3.1-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/kepler/BabelLanguagePack-eclipse-${language}_4.3.0.v20131123020001.zip'
    }
  }

  eclipseVersion('4.3.2') {

    eclipseMavenGroup = 'eclipse-kepler-sr2'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "$eclipseMirror/eclipse//technology/epp/downloads/release/kepler/SR2/eclipse-jee-kepler-SR2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "$eclipseMirror/eclipse//eclipse/downloads/drops4/R-4.3.2-201402211700/eclipse-SDK-4.3.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "$eclipseMirror/eclipse//eclipse/downloads/drops4/R-4.3.2-201402211700/eclipse-4.3.2-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.11.1/kepler/BabelLanguagePack-eclipse-${language}_4.3.0.v20131123020001.zip'
    }
  }

  eclipseVersion('4.4') {

    eclipseMavenGroup = 'eclipse-luna'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "$eclipseMirror/eclipse//technology/epp/downloads/release/luna/R/eclipse-jee-luna-R-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "$eclipseArchiveMirror/eclipse/downloads/drops4/R-4.4-201406061215/eclipse-SDK-4.4-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "$eclipseArchiveMirror/eclipse/downloads/drops4/R-4.4-201406061215/eclipse-4.4-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.12.1/luna/BabelLanguagePack-eclipse-${language}_4.4.0.v20141223043836.zip'
    }
  }

  eclipseVersion('4.4.1') {

    eclipseMavenGroup = 'eclipse-luna-sr1'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseMirror}/eclipse//technology/epp/downloads/release/luna/SR1/eclipse-jee-luna-SR1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.4.1-201409250400/eclipse-SDK-4.4.1-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseArchiveMirror}/eclipse/downloads/drops4/R-4.4.1-201409250400/eclipse-4.4.1-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.12.1/luna/BabelLanguagePack-eclipse-${language}_4.4.0.v20141223043836.zip'
    }
  }

  eclipseVersion('4.4.2') {

    eclipseMavenGroup = 'eclipse-luna-sr2'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseMirror}/eclipse//technology/epp/downloads/release/luna/SR2/eclipse-jee-luna-SR2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseMirror}/eclipse//eclipse/downloads/drops4/R-4.4.2-201502041700/eclipse-SDK-4.4.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true
      source "${eclipseMirror}/eclipse//eclipse/downloads/drops4/R-4.4.2-201502041700/eclipse-4.4.2-delta-pack.zip"

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.12.1/luna/BabelLanguagePack-eclipse-${language}_4.4.0.v20141223043836.zip'
    }
  }

  eclipseVersion('4.5') {

    eclipseMavenGroup = 'eclipse-mars'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseMirror}/eclipse//technology/epp/downloads/release/mars/2/eclipse-jee-mars-2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseMirror}/eclipse//eclipse/downloads/drops4/R-4.5-201506032000/eclipse-SDK-4.5-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.13.0/mars/BabelLanguagePack-eclipse-${language}_4.5.0.v20150804081228.zip'
    }
  }

  eclipseVersion('4.5.2') {

    eclipseMavenGroup = 'eclipse-mars-sr2'

    eclipseMirror = 'http://mirror.netcologne.de'

    eclipseArchiveMirror = 'http://archive.eclipse.org'

    sources {

      source "${eclipseMirror}/eclipse//technology/epp/downloads/release/mars/R/eclipse-jee-mars-R-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseMirror}/eclipse//eclipse/downloads/drops4/R-4.5.2-201602121500/eclipse-SDK-4.5.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.13.1/mars/BabelLanguagePack-eclipse-${language}_4.5.0.v20151128060001.zip'
    }
  }

  eclipseVersion('4.6.2') {

    eclipseMavenGroup = 'eclipse-neon-sr2'

    eclipseMirror = 'http://ftp.fau.de'
    eclipseArchiveMirror = 'http://ftp.fau.de'

    sources {

      source "${eclipseMirror}/eclipse/technology/epp/downloads/release/neon/R/eclipse-jee-neon-R-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseMirror}/eclipse/eclipse/downloads/drops4/R-4.6.2-201611241400/eclipse-SDK-4.6.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true

      languagePackTemplate '${eclipseMirror}/eclipse//technology/babel/babel_language_packs/R0.14.1/mars/BabelLanguagePack-eclipse-${language}_4.6.0.v20161126060001.zip'
    }
  }

  eclipseVersion('4.7.2') {

    // new Eclipse packging makes it impossible to use the .dmg file, at least not easily!
    suffix_os['macosx'] = 'linux-gtk'
    fileExt_os['macosx'] = 'tar.gz'

    eclipseMavenGroup = 'eclipse-oxygen-sr2'

    eclipseMirror = 'http://ftp.fau.de'
    eclipseArchiveMirror = 'http://ftp.fau.de'

    sources {
      
      //source "${eclipseMirror}/eclipse/technology/epp/downloads/release/oxygen/2/eclipse-jee-oxygen-2-linux-gtk-x86_64.tar.gz"
      source "${eclipseMirror}/eclipse/technology/epp/downloads/release/oxygen/2/eclipse-jee-oxygen-2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}"
      source "${eclipseMirror}/eclipse/eclipse/downloads/drops4/R-4.7.2-201711300510/eclipse-SDK-4.7.2-${suffix_os[current_os]}${suffix_arch[current_arch]}.${fileExt_os[current_os]}", sourcesOnly: true

      languagePackTemplate '${eclipseMirror}/eclipse/technology/babel/babel_language_packs/R0.15.1/oxygen/BabelLanguagePack-eclipse-${language}_4.7.0.v20171231020002.zip'
    }
  }
}
