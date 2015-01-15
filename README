###If you are planning to copy the impl and REST jars directly to the deploy directly, then do a

```
feature:repo-add cxf 2.7.11
feature:install cxf

```

in your karaf shell.


###If you are planning to use the feature.xml in your .kar project, use

```
feature:repo-add <<<PATH TO YOUR FEATURE.XML>>>/feature.xml
feature:install karafcxf

```


###Verify your installation using

```
karaf@root()> list | grep karafcxf
162 | Active |  80 | 1.0.0.SNAPSHOT | karafcxf.service.impl
163 | Active |  80 | 1.0.0.SNAPSHOT | karafcxf.rest

karaf@root()> cxf:list-endpoints
Name                      State      Address                                                      BusID
[HelloRestServiceImpl   ] [Started ] [/karafsimple                                              ] [cxfBus1                               ]

```