# TidbTest
Tidb test framework

## 1、tidb部署（可指定pd和tikv个数）：

方法：POST

请求链接：http://${domain}/deploy/deploy?pdSize=4&tikvSize=5

参考请求：http://localhost:8888/deploy/deploy?pdSize=4&tikvSize=5

参考返回：


## 2、获取case列表：

方法：GET

请求链接：http://${domain}/case/cases

参考请求：http://localhost:8888/case/cases

参考返回：{"id":"496534c2-62e4-4f17-b124-316f52d911d0","code":200,"message":"OK","data":["disabled_storage_engines.test","bug12427262.test","sort_buffer_size_functionality.test","select_none_bka.test","log_state.test","index_merge_innodb.test","grant_user_lock.test","heap_auto_increment.test","innodb_log_file_size_functionality.test","query_cache_notembedded.test","events_embedded.test","greedy_optimizer.test","ctype_gb18030_encoding_utf8.test","partition_debug_sync.test","bug33509.test","join_outer_innodb.test","greedy_search.test","ps_3innodb.test","lowercase_view.test","partition_truncate.test","temp_table.test","information_schema.test","func_aes.test","timezone3.test","ctype_gb18030_ligatures.test","select_icp_mrr_bka.test","lowercase_table2.test","read_only_innodb.test","ipv6.test","rpl_connect_attr.test","join_nested_bka_nixbnl.test","partition_order.test","shm.test","null.test","ctype_latin1.test","xa.test","datadir_permission.test","type_date.test","ctype_utf16_def.test","fulltext_cache.test","mysqld_daemon.test","ssl_cipher.test","row.test","gis-precise.test","ssl_compress.test","unsafe_binlog_innodb.test","test_security_context.test","multi_plugin_load_add.test","no_engine_substitution.test","drop-no_root.test","filesort_debug.test","variables-big.test","mysqlimport.test","index_merge_update.test","opt_hints_lowercase.test","max_statement_time.test","having.test","no_binlog_gtid_mode_on_explicit_prepared_stmts.test","server_offline_4.test","myisam_mrr_cost_all.test","gis-debug.test","func_test.test","mysql_upgrade_slave_master_info.test","partition_pruning.test","create-big.test","commit_1innodb.test","lowercase_fs_on.test","opt_costmodel_pfs.test","func_like.test","dirty_close.test","sp.test","charset.test","information_schema_db.test","secure_file_priv_win.test","range_icp.test","partition_explicit_prune.test","partition_innodb.test","order_by_none.test","explain_json_all.test","ddl_i18n_utf8.test","mysqldump_restore.test","subquery_sj_all_bka_nixbnl.test","partition_innodb_stmt.test","ctype_gb18030_binlog.test","read_many_rows_innodb.test","ps_10nestset.test","client_xml.test","concurrent_innodb_unsafelog.test","truncate_coverage.test","strict_autoinc_3heap.test","auth_rpl.test","ctype_utf16le.test","ctype_gbk_binlog.test","daemonize_opt.test","plugin_auth_qa_1.test","opt_hints_pfs.test","type_string.test","subquery_sj_firstmatch_bka.test","wl6301_1_not_windows.test","innodb_pk_extension_on.test","sp_debug.test","sp_trans.test","mysqlbinlog_row_big.test","partition_deprecation.test","range_mrr_cost.test","locking_service.test","bug12368203.test","bug46080.test","information_schema-big.test","func_weight_string.test","fulltext_left_join.test","heap_btree.test","schema.test","session_tracker.test","query_cache_type_functionality.test","loaddata_autocom_innodb.test","flush.test","version_token_errors.test","innodb_pk_extension_off.test","check.test","commit.test","transaction_isolation.test","func_aes_cfb128.test","log_tables_debug.test","fulltext_update.test","plugin_not_embedded.test","explain_other.test","mysqlbinlog_mixed_or_statment.test","index_merge_insert-and-replace.test","innodb_mrr.test","myisam_mrr_none.test","gis.test","ctype_utf8mb4_myisam.test","get_diagnostics.test","ssl_verify_identity.test","sp_validation.test","empty_table.test","opt_costmodel_flush.test","myisam.test","ctype_ujis_ucs2.test","innodb_mrr_none.test","ctype_euckr.test","partition_not_blackhole.test","temp_pool.test","initialize-yassl-warning.test","date_formats.test","partition_exchange.test","consistent_snapshot.test","check_auto_permission.test","show_profile.test","type_timestamp_explicit.test","ctype_utf8.test","no_binlog_gtid_next_single_stmt_trx_rollback.test","subquery_sj_dupsweed_bka_nixbnl.test","myisam_icp_all.test","ctype_uca.test","func_encrypt_ucs2.test","parser_bug21114_innodb.test","archive_symlink.test","func_gconcat.test","single_delete_update.test","partition_debug_sync_stmt.test","comment_table.test","tablespace.test","limit.test","innodb_recovery_with_upper_case_names.test","select_none.test","connect_debug.test","server_offline_5.test","mysqldump-compat.test","ssl-sha512.test","mysql_tzinfo_to_sql.test","flush2.test","variables-win.test","subquery_sj_all.test","innodb_deadlock.test","fix_priv_tables.test","query_cache_ps_no_prot.test","kill_debug.test","func_in_icp.test","not_embedded_server.test","no_binlog_gtid_next_partially_failed_stmts_anonymous.test","func_str_debug.test","fulltext_distinct.test","func_in_mrr_cost.test","func_if.test","myisam_mrr.test","outfile_loaddata.test","bug12969156.test","myisam_explain_non_select_all.test","key_primary.test","ssl_crl_clients_valid.test","wl6219-merge.test","range_with_memory_limit.test","flush_block_commit_notembedded.test","variables-notembedded.test","lock_multi_bug38499.test","timezone.test","ps_not_windows.test","myisam_recover.test","foreign_key.test","fulltext_multi.test","server_uuid.test","sp-prelocking.test","subquery_sj_innodb_all.test","timezone2.test","ssl.test","comment_column.test","func_set.test","log_timestamps.test","no_binlog_gtid_next_temporary_table.test","join_cache_bnl.test","partition_binlog_stmt.test","ctype_utf16.test","innodb_mrr_cost_icp.test","varbinary.test","subquery_sj_innodb_all_bka.test","replace.test","skip_grants_flush.test","wl6219-memory.test","wl6661.test","create.test","ssl_crl_crlpath.test","subquery_nomat_nosj_bka.test","multi_update.test","csv_not_null.test","mysqlpump_basic.test","view_alias.test","mysql_embedded.test","windows.test","table_open_cache_functionality.test","deprecate_eof.test","func_misc.test","subquery_sj_innodb_none.test","user_lock.test","sp-fib.test","sp_notembedded.test","select_for_update.test","bug46760.test","ps_4heap.test","myisam_crash_before_flush_keys.test","negation_elimination.test","session_tracker_trx_state.test","variables_community.test","func_compress.test","type_set.test","query_cache_merge.test","type_binary.test","archive_debug.test","type_bit.test","ipv4_as_ipv6.test","insert.test","func_des_encrypt.test","server_offline_2.test","subquery_sj_mat_bkaunique.test","status.test","blackhole.test","sp_stress_case.test","events_trans.test","opt_hints.test","ssl_and_innodb.test","server_uuid_embedded.test","no_binlog_gtid_empty_transaction.test","func_found_rows.test","func_aes_cfb8.test","myisam-blob.test","events_scheduling.test","type_temporal_fractional.test","deprecated_features.test","mysqlpump_extended.test","events_logs_tests.test","log_tables-big.test","type_newdecimal.test","innodb_explain_json_non_select_none.test","bug17076131.test","mysqlbinlog.test","ctype_utf8mb4.test","myisam_icp.test","subquery_sj_loosescan_bka_nixbnl.test","sp-dynamic.test","heap_hash.test","ctype_ucs.test","ctype_many.test","sp-error.test","type_datetime.test","user_limits.test","execution_constants.test","mysql_cp932.test","ctype_cp1250_ch.test","wl5928.test","union.test","show_processlist_state.test","mysqldump-binary.test","temporal_literal.test","system_mysql_db.test","group_by.test","myisam_debug.test","myisam_explain_json_non_select_none.test","ssl_8k_key.test","type_enum.test","disconnect_on_expired_password_default.test","subquery_nomat_nosj.test","subquery_sj_innodb_all_bka_nixbnl.test","func_date_add.test","myisam_mrr_cost.test","sql_mode.test","index_merge_myisam.test","func_in_all.test","innodb_mrr_cost.test","no_binlog.test","ctype_gb18030.test","mysql_protocols.test","partition_charset.test","drop_debug.test","subquery_mat.test","subquery_mat_all.test","skip_name_resolve.test","skip_grants.test","version_token.test","bootstrap.test","trigger-compat.test","query_cache_28249.test","comment_index.test","lock_tables_lost_commit.test","blackhole_plugin.test","mysqlbinlog_debug.test","order_by_icp_mrr.test","signal_code.test","status_bug17954.test","sp-security.test","type_blob.test","func_sapdb.test","subquery_mat_none.test","keywords.test","func_in_mrr.test","subquery_sj_dupsweed_bka.test","warnings.test","loadxml.test","func_in_none.test","sp-threads.test","filter_single_col_idx_big.test","ctype_like_range.test","create_select_tmp.test","insert_select.test","implicit_char_to_num_conversion.test","no_binlog_gtid_next_partially_failed_stmts.test","plugin_auth_qa.test","alter_table-big.test","case.test","compare.test","endspace.test","gcc296.test","multi_plugin_load.test","innodb_mrr_cost_all.test","multi_update_tiny_hash.test","subquery_sj_mat_bka.test","system_mysql_db_refs.test","join.test","mysqlpump_partial_bkp.test","fulltext2.test","mysqld_safe.test","lowercase_table4.test","bench_count_distinct.test","events_bugs.test","events_1.test","table_definition_cache_functionality.test","partition_myisam.test","bigint.test","plugin_load_option.test","lowercase_mixed_tmpdir.test","archive_bitfield.test","view_gtid_mode_on_debug.test","no_binlog_gtid_next_begin_caused_trx.test","func_math.test","group_by_fd_ps_prot.test","renamedb.test","transaction_read_only.test","func_rollback.test","subquery_all_bka.test","ctype_gb2312.test","concurrent_innodb_safelog.test","partition_sync.test","mysql_not_windows.test","system_mysql_db_fix40123.test","subquery_none.test","events_microsec.test","rpl_multi_source_mysqldump_slave.test","innodb_icp.test","grant_debug.test","signal_demo3.test","myisam_explain_non_select_none.test","select_found.test","signal_demo2.test","events_grant.test","alias.test","partition_federated.test","ps_11bugs.test","validate_password_plugin.test","type_year.test","system_mysql_db_fix50030.test","archive_no_symlink.test","ctype_ujis.test","initialize-sha256.test","gis-rtree.test","rename.test","sql_mode_default.test","func_default.test","mysqlshow.test","fulltext3.test","lowercase_table5.test","partition_windows.test","lowercase_mixed_tmpdir_innodb.test","timezone4.test","file_contents.test","read_only.test","plugin_auth_sha256.test","1st.test","mysql-bug41486.test","wl6443_deprecation.test","host_cache_size_functionality.test","ctype_utf8mb4_innodb.test","ctype_cp932.test","func_digest.test","func_system.test","group_min_max_innodb.test","variables.test","type_nchar.test","skip_log_bin.test","func_timestamp.test","merge_innodb.test","enable_cleartext_plugin.test","select_icp_mrr.test","error_simulation.test","round.test","ctype_mb.test","ctype_gbk.test","initialize-errors.test","tablelock.test","range_mrr.test","subquery_sj_loosescan_bkaunique.test","multi_update2.test","type_uint.test","type_temporal_upgrade.test","ctype_errors.test","join_outer_bka_nixbnl.test","wl6978.test","udf_skip_grants.test","profiling.test","per_thread_connection_handler.test","innodb_icp_none.test","information_schema_inno.test","lowercase_table.test","grant_lowercase_fs.test","mysql_ssl.test","acl_tables_errors_debug.test","myisam_icp_none.test","myisam_mrr_cost_icp.test","create_not_windows.test","range_all.test","csv_alter_table.test","installdb-bad-cipher.test","innodb_icp_all.test","mysql_comments.test","mysql-bug45236.test","warnings_engine_disabled.test","func_equal.test","subquery_sj_innodb_none_bka.test","insert_update.test","ctype_filesystem.test","initialize.test","func_analyse.test","mysql_binary_mode.test","partition_locking_4.test","binary.test","update.test","plugin_auth_sha256_server_default_tls.test","information_schema_chmod.test","key_diff.test","order_by_sortkey.test","merge.test","constraints.test","flush_read_lock.test","partition_mgm_err2.test","help_verbose.test","xa_gtid.test","default.test","strict_autoinc_1myisam.test","parser.test","join_cache_bka.test","debug_sync2.test","sp-ucs2.test","user_var-binlog.test","outfile.test","wl6711_heap_to_disk.test","grant_explain_non_select.test","partition_key_cache.test","partition_cache.test","mysql_plugin.test","alter_table.test","server_offline_3.test","innodb_explain_non_select_none.test","drop.test","help.test","sp-bugs.test","information_schema_parameters.test","debug_sync.test","sp_trans_log.test","innodb_mysql_sync.test","innodb_ignore_builtin.test","ps_1general.test","fulltext_plugin.test","examined_rows.test","range_icp_mrr.test","initialize-init-acls.test","ctype_collate.test","condition_filter.test","status2.test","partition_not_windows.test","type_time.test","mysqlslap.test","perror-win.test","merge-big.test","query_cache_disabled.test","flush_read_lock_kill.test","ctype_hebrew.test","xa_prepared_binlog_off.test","ctype_recoding.test","subquery_sj_firstmatch.test","partition_grant.test","partition_hash.test","grant_cache.test","handler_innodb.test","gtids_anonymous_trxs_violations.test","ansi.test","trigger_wl3253.test","system_mysql_db_fix50117.test","ctype_binary.test","opt_costmodel_tables.test","subquery_all_bka_nixbnl.test","partition_bug18198.test","lock_multi_bug38691.test","mysqldump-no-binlog.test","lock.test","subselect_gis.test","truncate.test","mysqlbinlog_raw_mode_win.test","log_tables.test","ssl_ca.test","join_cache_bkaunique.test","mysqldump.test","openssl_1.test","trigger_wl6030.test","signal_demo1.test","myisam_explain_json_non_select_all.test","subquery_sj_none.test","shutdown.test","get_table_share.test","mdl_tablespace.test","kill.test","filesort_merge.test","ps_ddl.test","information_schema_part.test","optimizer_debug_sync.test","events_trans_notembedded.test","subquery_sj_none_bka.test","mysql_client_test_qcache.test","multi_plugin_load_add2.test","query_cache.test","ctype_ascii.test","func_bitwise_ops.test","initialize-bug20504142.test","ctype_cp932_binlog_stm.test","bool.test","subquery_sj_dupsweed.test","subquery_sj_innodb_none_bkaunique.test","user_var.test","mysql_client_test_embedded.test","ctype_gb18030_encoding_cn.test","view_grant.test","ds_mrr-big.test","type_bit_innodb.test","xa_debug.test","partition_list.test","mysql_ssl_default.test","partition_datatype.test","query_cache_ps_ps_prot.test","myisam_row_rpl.test","errors.test","ssl_connect.test","delete_all_rows.test","innodb_mrr_icp.test","bug58669.test","partition_csv.test","validate_password_plugin_check_user.test","events_and_binlog.test","fulltext_var.test","subquery_sj_mat_bka_nixbnl.test","subquery_sj_dupsweed_bkaunique.test","comments.test","xml.test","no_binlog_gtid_mode_on.test","key.test","explain_for_connection_rqg_trad.test","sp-vars.test","subquery_sj_mat.test","distinct.test","func_group.test","sysdate_is_now.test","archive_plugin.test","no_binlog_gtid_empty_statement.test","subquery_sj_all_bka.test","mysqldumpslow.test","ssl_crl_clients.test","archive_gis.test","wl6219-innodb.test","subselect_innodb.test","null_key_icp.test","myisam_mrr_all.test","optimizer_switch.test","implicit_commit.test","subquery_none_bka_nixbnl.test","partition_debug.test","mysql_client_test.test","sp_gis.test","partition_plugin.test","signal.test","subquery_sj_loosescan_bka.test","mysqlcheck.test","mix2_myisam_ucs2.test","mysql_upgrade.test","named_pipe.test","func_group_innodb_16k.test","subquery_sj_loosescan.test","events_2.test","partition_utf8.test","not_partition.test","sum_distinct.test","ssl-big.test","parser_precedence.test","subquery_sj_firstmatch_bkaunique.test","partition_index_myisam.test","sp_sync.test","partition_range.test","lock_sync.test","archive.test","mysqlpump_multi_thread.test","subquery_sj_firstmatch_bka_nixbnl.test","binary_to_hex.test","sp-destruct.test","explain_for_connection_crash.test","subselect_notembedded.test","multi_update_innodb.test","ps.test","mysqld--help-win.test","optimizer_bug12837084.test","ps_grant.test","ctype_gb18030_conversion.test","dynamic_tracing.test","myisam-system.test","symlink.test","create_w_max_indexes_64.test","server_offline_1.test","myisampack.test","ctype_cp1251.test","internal_tmp_disk_storage_engine.test","delete.test","mix2_myisam.test","log_errchk.test","variables_debug.test","select_all.test","connect.test","wl6219-csv.test","plugin_auth_expire.test","ctype_ucs2_def.test","join_cache_bka_nixbnl.test","select_all_bka.test","partition_column.test","mysqlpump.test","group_min_max.test","ctype_utf16_uca.test","olap.test","subquery_none_bka.test","func_concat.test","parser-big-32bit.test","explain_for_connection_small_trad.test","order_by_limit.test","innodb_mysql_lock2.test","ctype_utf32.test","func_str_no_ps.test","mysqldump-max.test","plugin_auth_sha256_server_default.test","partition_rename_longfilename.test","csv.test","subquery_sj_mat_nosj.test","func_crypt.test","disconnect_on_expired_password_off.test","ps_ddl1.test","initialize-bug21335821.test","ctype_eucjpms.test","func_str.test","func_aes_misc.test","mysql_config_editor.test","plugin_auth_sha256_2.test","almost_full.test","grant4.test","cache_innodb.test","udf_services.test","initialize-ignore-db.test","sp-code.test","compress.test","myisam_mrr_icp.test","null_key_all.test","join_outer.test","init_file.test","flush_table.test","ctype_latin1_de.test","parser-big-64bit.test","handler_myisam.test","odbc.test","merge_mmap.test","plugin_load.test","rowid_order_innodb.test","cast.test","count_distinct.test","metadata.test","rewrite_general_log.test","no_binlog_gtid_next_partially_failed_stmts_error.test","range_none.test","grant.test","func_regexp.test","partition_innodb_tablespace.test","innodb_disabled.test","function_defaults.test","opt_costmodel_warnings.test","order_fill_sortbuf.test","ctype_sjis.test","mysqld--help-notwin.test","ctype_ldml.test","auto_increment.test","ctype_latin2_ch.test","locale.test","ctype_filename.test","grant_user_lock_qa.test","subquery_sj_innodb_all_bkaunique.test","ctype_big5.test","partition_mgm.test","log_tables_upgrade.test","index_merge_intersect_dml.test","timezone_grant.test","opt_costmodel_downgrade.test","show_variables.test","partition_locking.test","partition_column_prune.test","utility_warnings.test","subquery_sj_none_bkaunique.test","preload.test","subquery_sj_all_bkaunique.test","ps_5merge.test","order_by_all.test","wl6301_2_not_windows.test","partition_binlog.test","loaddata.test","func_encrypt_nossl.test","ctype_create.test","innodb_explain_non_select_all.test","import_schema_mismatch.test","ignore_strict.test","parser_stack.test","mysqlpump_charset.test","opt_costmodel.test","mysql_embedded_client_test.test","explain_for_connection_rqg_json.test","grant3.test","subquery_sj_none_bka_nixbnl.test","log_state_bug33693.test","mysql_locale_posix.test","comment_column2.test","udf.test","type_decimal.test","type_timestamp.test","plugin_auth.test","information_schema_routines.test","bug39022.test","sum_distinct-big.test","lowercase_utf8.test","count_distinct2.test","lowercase_table_grant.test","strict.test","deadlock_innodb.test","sp-lock.test","heap.test","gtid_next_xa_binlog_off.test","ctype_utf8mb4_heap.test","grant_alter_user_qa.test","status_debug.test","plugin_auth_qa_3.test","partition_innodb_semi_consistent.test","initialize_gtid.test","upgrade.test","fulltext_order_by.test","events_stress.test","mysqlpump_filters.test","rewrite_slow_log.test","wl6219-upgrade.test","plugin.test","rollback.test","strict_autoinc_2innodb.test","long_tmpdir.test","eq_range_idx_stat.test","join_cache_nojb.test","sp-no-code.test","parser_not_embedded.test","mysqlpump_concurrency.test","user_if_exists.test","gis-rt-precise.test","opt_hints_subquery.test","index_merge_delete.test","ssl_crl.test","query_cache_debug.test","server_offline_6.test","ctype_tis620.test","lowercase_table_qcache.test","select_all_bka_nixbnl.test","subquery_all.test","key_cache.test","opt_hint_timeout.test","disabled_replication.test","show_check.test","plugin_auth_sha256_tls.test","innodb_mysql_lock.test","signal_sqlmode.test","wl6301_3.test","func_in_icp_mrr.test","filter_single_col_idx_small.test","events_restart.test","partition_blackhole.test","subquery_nomat_nosj_bka_nixbnl.test","func_group_innodb.test","derived.test","ctype_utf32_uca.test","mysql_upgrade_ssl.test","ctype_cp932_binlog_row.test","wait_timeout.test","innodb_explain_json_non_select_all.test","ctype_utf8mb4_uca.test","ddl_i18n_koi8r.test","mysqlbinlog_raw_mode.test","synchronization.test","mysqltest.test","subquery_bugs.test","shm_server_restart.test","partition.test","type_float.test","trans_read_only.test","join_nested.test","partition_index_innodb.test","multi_statement.test","subselect_debug.test","func_time.test","perror.test","func_op.test","flush_block_commit.test","repair.test","explain.test","packet.test","fulltext.test","plugin_auth_qa_2.test","mysql.test","mysqladmin.test","partition_symlink.test","initialize-bug20350099.test","trigger_notembedded.test","type_newdecimal-big.test","version_token_bug21280801.test","partition_mgm_err.test","count_distinct3.test","init_connect.test","func_aes_ofb.test","events_time_zone.test","filesort_pack.test","ps_2myisam.test","join_nested_bka.test","reset_connection.test","wl6219-myisam.test","type_ranges.test","timezone_debug.test","grant2.test","group_by_fd_no_prot.test","query_cache_size_functionality.test","join_outer_bka.test","is_deprecation.test","rpl_mysqldump_slave.test","view.test","mysqld--defaults-file.test","mysql_tzinfo_to_sql_sys.test","sp-big.test","trigger.test","func_encrypt.test","archive-big.test","opt_costmodel_restart.test","type_varchar.test","explain_for_connection_small_json.test","func_aes_cfb1.test","bulk_replace.test","analyze.test","bug46261.test","wl3836.test","trigger-trans.test","change_user.test","partition_archive.test","ps_w_max_indexes_64.test","select_safe.test","lock_multi.test","m_i_db.test","handler_read_last.test","grant_alter_user.test","overflow.test","null_key_none.test","explain_json_none.test","query_cache_with_views.test","func_isnull.test","partition_innodb_plugin.test","ctype_latin2.test","partition_error.test","mdl_sync.test","select_none_bka_nixbnl.test","select_icp_mrr_bka_nixbnl.test","innodb_mrr_all.test","insert_notembedded.test","lowercase_fs_off.test","no-threads.test","plugin_auth_user_lock.test","join_crash.test","bug47671.test","subquery_sj_innodb_none_bka_nixbnl.test","mysql_upgrade_with_session_user.test","trigger_debug.test"]}


## 3、执行指定的cases：

方法：POST

请求链接：http://${domain}/case/run_cases

参数:json的列表，元素类型为字符串

参考请求：

PS : 参数从获取case列表借口获取


## 4、停止指定的服务
方法：POST
请求链接：http://${domain}/error_inject/stop_server
参数：server，服务名字，例如：pd0、tikv1等，可选。如果不传，则停止整个集群
